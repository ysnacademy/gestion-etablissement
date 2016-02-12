package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IDiplomeDAO;
import com.ysnacademy.model.Diplome;

public class DiplomeDAO implements IDiplomeDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addDiplome(Diplome diplome) {
		getSessionFactory().getCurrentSession().save(diplome);

	}

	public void updateDiplome(Diplome diplome) {
		getSessionFactory().getCurrentSession().update(diplome);


	}

	public void deleteDiplome(Diplome diplome) {
		getSessionFactory().getCurrentSession().delete(diplome);


	}

	public Diplome getDiplomeById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from Diplome where idDiplome=?")
		                 .setParameter(0, id).list();
		  return (Diplome)list.get(0);
	}

	public List<Diplome> getDiplomes() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Diplome").list();
		  return list;
	}

}
