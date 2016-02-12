package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IMotifAbsenceDAO;
import com.ysnacademy.model.MotifAbsence;

public class MotifAbsenceDAO implements IMotifAbsenceDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addMotifAbsence(MotifAbsence motifAbsence) {
		getSessionFactory().getCurrentSession().save(motifAbsence);

	}

	public void updateMotifAbsence(MotifAbsence motifAbsence) {
		getSessionFactory().getCurrentSession().update(motifAbsence);


	}

	public void deleteMotifAbsence(MotifAbsence motifAbsence) {
		getSessionFactory().getCurrentSession().delete(motifAbsence);


	}

	public MotifAbsence getMotifAbsenceById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (MotifAbsence)list.get(0);
	}

	public List<MotifAbsence> getMotifAbsences() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}

}
