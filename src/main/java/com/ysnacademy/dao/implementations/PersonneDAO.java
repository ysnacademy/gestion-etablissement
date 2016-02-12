package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ysnacademy.dao.interfaces.IPersonneDAO;
import com.ysnacademy.model.Personne;

public class PersonneDAO implements IPersonneDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addPersonne(Personne personne) {
		getSessionFactory().getCurrentSession().save(personne);

	}

	public void updatePersonne(Personne personne) {
		getSessionFactory().getCurrentSession().update(personne);

	}

	public void deletePersonne(Personne personne) {
		getSessionFactory().getCurrentSession().delete(personne);

	}

	public Personne getPersonneById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Personne where idPersonne=?").setParameter(0, id).list();
		return (Personne) list.get(0);
	}

	public List<Personne> getPersonnes() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Personne").list();
		return list;
	}

}
