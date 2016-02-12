package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IMatiereDAO;
import com.ysnacademy.model.Matiere;

public class MatiereDAO implements IMatiereDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addMatiere(Matiere matiere) {
		getSessionFactory().getCurrentSession().save(matiere);

	}

	public void updateMatiere(Matiere matiere) {
		getSessionFactory().getCurrentSession().update(matiere);


	}

	public void deleteMatiere(Matiere matiere) {
		getSessionFactory().getCurrentSession().delete(matiere);


	}

	public Matiere getMatiereById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from Matiere where idMatiere=?")
		                 .setParameter(0, id).list();
		  return (Matiere)list.get(0);
	}

	public List<Matiere> getMatieres() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Matiere").list();
		  return list;
	}
}
