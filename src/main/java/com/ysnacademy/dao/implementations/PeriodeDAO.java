package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IPeriodeDAO;
import com.ysnacademy.model.Periode;

public class PeriodeDAO implements IPeriodeDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addPeriode(Periode periode) {
		getSessionFactory().getCurrentSession().save(periode);

	}

	public void updatePeriode(Periode periode) {
		getSessionFactory().getCurrentSession().update(periode);


	}

	public void deletePeriode(Periode periode) {
		getSessionFactory().getCurrentSession().delete(periode);


	}

	public Periode getPeriodeById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Periode)list.get(0);
	}

	public List<Periode> getPeriodes() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}

}
