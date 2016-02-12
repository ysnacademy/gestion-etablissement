package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IEmployeDAO;
import com.ysnacademy.model.Employe;

public class EmployeDAO implements IEmployeDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEmploye(Employe employe) {
		getSessionFactory().getCurrentSession().save(employe);

	}

	public void updateEmploye(Employe employe) {
		getSessionFactory().getCurrentSession().update(employe);


	}

	public void deleteEmploye(Employe employe) {
		getSessionFactory().getCurrentSession().delete(employe);


	}

	public Employe getEmployeById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Employe)list.get(0);
	}

	public List<Employe> getEmployes() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
