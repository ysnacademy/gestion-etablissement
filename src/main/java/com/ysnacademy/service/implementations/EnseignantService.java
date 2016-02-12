package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IEnseignantDAO;
import com.ysnacademy.model.Enseignant;
import com.ysnacademy.service.interfaces.IEnseignantService;

@Service
@Transactional(readOnly = false)
public class EnseignantService implements IEnseignantService {

	IEnseignantDAO iEnseignantDAO;

	public IEnseignantDAO getiEnseignantDAO() {
		return iEnseignantDAO;
	}

	public void setiEnseignantDAO(IEnseignantDAO iEnseignantDAO) {
		this.iEnseignantDAO = iEnseignantDAO;
	}

	@Transactional(readOnly = false)
	public void addEnseignant(Enseignant enseignant) {
		getiEnseignantDAO().addEnseignant(enseignant);

	}

	@Transactional(readOnly = false)
	public void updateEnseignant(Enseignant enseignant) {
		getiEnseignantDAO().updateEnseignant(enseignant);

	}
	@Transactional(readOnly = false)
	public void deleteEnseignant(Enseignant enseignant) {
		getiEnseignantDAO().deleteEnseignant(enseignant);

	}
	
	public Enseignant getEnseignantById(int id) {
		return getiEnseignantDAO().getEnseignantById(id);
	}

	public List<Enseignant> getEnseignants() {
		return getiEnseignantDAO().getEnseignants();
	}

}
