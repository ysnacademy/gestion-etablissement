package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.ITuteurEleveDAO;
import com.ysnacademy.model.TuteurEleve;

public class TuteurEleveDAO implements ITuteurEleveDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addTuteurEleve(TuteurEleve tuteurEleve) {
		getSessionFactory().getCurrentSession().save(tuteurEleve);

	}

	public void updateTuteurEleve(TuteurEleve tuteurEleve) {
		getSessionFactory().getCurrentSession().update(tuteurEleve);


	}

	public void deleteTuteurEleve(TuteurEleve tuteurEleve) {
		getSessionFactory().getCurrentSession().delete(tuteurEleve);


	}

	public TuteurEleve getTuteurEleveById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (TuteurEleve)list.get(0);
	}

	public List<TuteurEleve> getTuteurEleves() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}

}
