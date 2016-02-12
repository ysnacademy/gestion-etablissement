package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.ICadreAdministratifDAO;
import com.ysnacademy.model.CadreAdministratif;
import com.ysnacademy.service.interfaces.ICadreAdministratifService;

@Service
@Transactional(readOnly = false)
public class CadreAdministratifService implements ICadreAdministratifService {

	ICadreAdministratifDAO iCadreAdministratifDAO;

	public ICadreAdministratifDAO getiCadreAdministratifDAO() {
		return iCadreAdministratifDAO;
	}

	public void setiCadreAdministratifDAO(ICadreAdministratifDAO iCadreAdministratifDAO) {
		this.iCadreAdministratifDAO = iCadreAdministratifDAO;
	}

	@Transactional(readOnly = false)
	public void addCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getiCadreAdministratifDAO().addCadreAdministratif(cadreAdministratif);

	}

	@Transactional(readOnly = false)
	public void updateCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getiCadreAdministratifDAO().updateCadreAdministratif(cadreAdministratif);

	}
	@Transactional(readOnly = false)
	public void deleteCadreAdministratif(CadreAdministratif cadreAdministratif) {
		getiCadreAdministratifDAO().deleteCadreAdministratif(cadreAdministratif);

	}
	
	public CadreAdministratif getCadreAdministratifById(int id) {
		return getiCadreAdministratifDAO().getCadreAdministratifById(id);
	}

	public List<CadreAdministratif> getCadreAdministratifs() {
		return getiCadreAdministratifDAO().getCadreAdministratifs();
	}

}
