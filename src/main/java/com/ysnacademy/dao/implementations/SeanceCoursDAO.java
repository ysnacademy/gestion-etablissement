package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.ISeanceCoursDAO;
import com.ysnacademy.model.SeanceCours;

public class SeanceCoursDAO implements ISeanceCoursDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addSeanceCours(SeanceCours seanceCours) {
		getSessionFactory().getCurrentSession().save(seanceCours);

	}

	public void updateSeanceCours(SeanceCours seanceCours) {
		getSessionFactory().getCurrentSession().update(seanceCours);


	}

	public void deleteSeanceCours(SeanceCours seanceCours) {
		getSessionFactory().getCurrentSession().delete(seanceCours);


	}

	public SeanceCours getSeanceCoursById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (SeanceCours)list.get(0);
	}

	public List<SeanceCours> getSeanceCourss() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
