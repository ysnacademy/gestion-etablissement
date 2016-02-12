package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IInscriptionDAO;
import com.ysnacademy.model.Inscription;

public class InscriptionDAO implements IInscriptionDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addInscription(Inscription inscription) {
		getSessionFactory().getCurrentSession().save(inscription);

	}

	public void updateInscription(Inscription inscription) {
		getSessionFactory().getCurrentSession().update(inscription);


	}

	public void deleteInscription(Inscription inscription) {
		getSessionFactory().getCurrentSession().delete(inscription);


	}

	public Inscription getInscriptionById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Inscription)list.get(0);
	}

	public List<Inscription> getInscriptions() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
