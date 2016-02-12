package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IEleveDAO;
import com.ysnacademy.model.Eleve;

public class EleveDAO implements IEleveDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEleve(Eleve eleve) {
		getSessionFactory().getCurrentSession().save(eleve);

	}

	public void updateEleve(Eleve eleve) {
		getSessionFactory().getCurrentSession().update(eleve);


	}

	public void deleteEleve(Eleve eleve) {
		getSessionFactory().getCurrentSession().delete(eleve);


	}

	public Eleve getEleveById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Eleve)list.get(0);
	}

	public List<Eleve> getEleves() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
