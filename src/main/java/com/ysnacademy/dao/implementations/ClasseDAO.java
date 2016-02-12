package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IClasseDAO;
import com.ysnacademy.model.Classe;

public class ClasseDAO implements IClasseDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addClasse(Classe classe) {
		getSessionFactory().getCurrentSession().save(classe);

	}

	public void updateClasse(Classe classe) {
		getSessionFactory().getCurrentSession().update(classe);


	}

	public void deleteClasse(Classe classe) {
		getSessionFactory().getCurrentSession().delete(classe);


	}

	public Classe getClasseById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Classe)list.get(0);
	}

	public List<Classe> getClasses() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
