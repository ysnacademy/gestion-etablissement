package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IPersonneDAO;
import com.ysnacademy.model.Personne;
import com.ysnacademy.service.interfaces.IPersonneService;

@Service
@Transactional
public class PersonneService implements IPersonneService {

	private IPersonneDAO personneDAO;

	public IPersonneDAO getPersonneDAO() {
		return personneDAO;
	}

	public void setPersonneDAO(IPersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	@Transactional(readOnly = false)
	public void addPersonne(Personne personne) {
		getPersonneDAO().addPersonne(personne);

	}

	@Transactional(readOnly = false)
	public void updatePersonne(Personne personne) {
		getPersonneDAO().updatePersonne(personne);

	}

	@Transactional(readOnly = false)
	public void deletePersonne(Personne personne) {
		getPersonneDAO().deletePersonne(personne);

	}

	public Personne getPersonneById(int id) {
		return getPersonneDAO().getPersonneById(id);
	}

	public List<Personne> getPersonnes() {
		return getPersonneDAO().getPersonnes();
	}

}
