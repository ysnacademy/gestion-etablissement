package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IDiplomeDAO;
import com.ysnacademy.model.Diplome;
import com.ysnacademy.service.interfaces.IDiplomeService;

@Service
@Transactional(readOnly = false)
public class DiplomeService implements IDiplomeService {

	IDiplomeDAO iDiplomeDAO;

	public IDiplomeDAO getiDiplomeDAO() {
		return iDiplomeDAO;
	}

	public void setiDiplomeDAO(IDiplomeDAO iDiplomeDAO) {
		this.iDiplomeDAO = iDiplomeDAO;
	}

	@Transactional(readOnly = false)
	public void addDiplome(Diplome diplome) {
		getiDiplomeDAO().addDiplome(diplome);

	}

	@Transactional(readOnly = false)
	public void updateDiplome(Diplome diplome) {
		getiDiplomeDAO().updateDiplome(diplome);

	}
	@Transactional(readOnly = false)
	public void deleteDiplome(Diplome diplome) {
		getiDiplomeDAO().deleteDiplome(diplome);

	}
	
	public Diplome getDiplomeById(int id) {
		return getiDiplomeDAO().getDiplomeById(id);
	}

	public List<Diplome> getDiplomes() {
		return getiDiplomeDAO().getDiplomes();
	}

}
