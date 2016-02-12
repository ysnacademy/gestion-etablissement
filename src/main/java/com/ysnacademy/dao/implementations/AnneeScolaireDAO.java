package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IAnneeScolaireDAO;
import com.ysnacademy.model.AnneeScolaire;

public class AnneeScolaireDAO implements IAnneeScolaireDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAnneeScolaire(AnneeScolaire anneeScolaire) {
		getSessionFactory().getCurrentSession().save(anneeScolaire);

	}

	public void updateAnneeScolaire(AnneeScolaire anneeScolaire) {
		getSessionFactory().getCurrentSession().update(anneeScolaire);


	}

	public void deleteAnneeScolaire(AnneeScolaire anneeScolaire) {
		getSessionFactory().getCurrentSession().delete(anneeScolaire);


	}

	public AnneeScolaire getAnneeScolaireById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (AnneeScolaire)list.get(0);
	}

	public List<AnneeScolaire> getAnneeScolaires() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}

}
