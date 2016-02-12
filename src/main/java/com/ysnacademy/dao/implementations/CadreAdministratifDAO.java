package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.ICadreAdministratifDAO;
import com.ysnacademy.model.CadreAdministratif;

public class CadreAdministratifDAO implements ICadreAdministratifDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getSessionFactory().getCurrentSession().save(cadreAdministratif);

	}

	public void updateCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getSessionFactory().getCurrentSession().update(cadreAdministratif);

	}

	public void deleteCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getSessionFactory().getCurrentSession().delete(cadreAdministratif);

	}

	public CadreAdministratif getCadreAdministratifById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from User where id=?").setParameter(0, id).list();
		return (CadreAdministratif) list.get(0);
	}

	public List<CadreAdministratif> getCadreAdministratifs() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from User").list();
		return list;
	}

}
