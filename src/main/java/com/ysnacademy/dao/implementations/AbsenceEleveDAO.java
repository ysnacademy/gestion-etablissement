package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ysnacademy.dao.interfaces.IAbsenceEleveDAO;
import com.ysnacademy.model.AbsenceEleve;

public class AbsenceEleveDAO implements IAbsenceEleveDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAbsenceEleve(AbsenceEleve absenceEleve) {
		getSessionFactory().getCurrentSession().save(absenceEleve);

	}

	public void updateAbsenceEleve(AbsenceEleve absenceEleve) {
		getSessionFactory().getCurrentSession().update(absenceEleve);


	}

	public void deleteAbsenceEleve(AbsenceEleve absenceEleve) {
		getSessionFactory().getCurrentSession().delete(absenceEleve);


	}

	public AbsenceEleve getAbsenceEleveById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (AbsenceEleve)list.get(0);
	}

	public List<AbsenceEleve> getAbsenceEleves() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
