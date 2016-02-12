package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IBulletinDAO;
import com.ysnacademy.model.Bulletin;

public class BulletinDAO implements IBulletinDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addBulletin(Bulletin bulletin) {
		getSessionFactory().getCurrentSession().save(bulletin);

	}

	public void updateBulletin(Bulletin bulletin) {
		getSessionFactory().getCurrentSession().update(bulletin);


	}

	public void deleteBulletin(Bulletin bulletin) {
		getSessionFactory().getCurrentSession().delete(bulletin);


	}

	public Bulletin getBulletinById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Bulletin)list.get(0);
	}

	public List<Bulletin> getBulletins() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
