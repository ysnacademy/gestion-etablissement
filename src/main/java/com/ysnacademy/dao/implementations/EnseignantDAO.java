package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IEnseignantDAO;
import com.ysnacademy.model.Enseignant;

public class EnseignantDAO implements IEnseignantDAO{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEnseignant(Enseignant enseignant) {
		getSessionFactory().getCurrentSession().save(enseignant);

	}

	public void updateEnseignant(Enseignant enseignant) {
		getSessionFactory().getCurrentSession().update(enseignant);


	}

	public void deleteEnseignant(Enseignant enseignant) {
		getSessionFactory().getCurrentSession().delete(enseignant);


	}

	public Enseignant getEnseignantById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Enseignant)list.get(0);
	}

	public List<Enseignant> getEnseignants() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
