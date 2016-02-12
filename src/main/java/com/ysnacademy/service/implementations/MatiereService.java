package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IMatiereDAO;
import com.ysnacademy.model.Matiere;
import com.ysnacademy.service.interfaces.IMatiereService;

@Service
@Transactional(readOnly = false)
public class MatiereService implements IMatiereService {

	IMatiereDAO iMatiereDAO;

	public IMatiereDAO getiMatiereDAO() {
		return iMatiereDAO;
	}

	public void setiMatiereDAO(IMatiereDAO iMatiereDAO) {
		this.iMatiereDAO = iMatiereDAO;
	}

	@Transactional(readOnly = false)
	public void addMatiere(Matiere matiere) {
		getiMatiereDAO().addMatiere(matiere);

	}

	@Transactional(readOnly = false)
	public void updateMatiere(Matiere matiere) {
		getiMatiereDAO().updateMatiere(matiere);

	}
	@Transactional(readOnly = false)
	public void deleteMatiere(Matiere matiere) {
		getiMatiereDAO().deleteMatiere(matiere);

	}
	
	public Matiere getMatiereById(int id) {
		return getiMatiereDAO().getMatiereById(id);
	}

	public List<Matiere> getMatieres() {
		return getiMatiereDAO().getMatieres();
	}

}
