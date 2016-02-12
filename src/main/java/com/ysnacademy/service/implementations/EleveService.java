package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IEleveDAO;
import com.ysnacademy.model.Eleve;
import com.ysnacademy.service.interfaces.IEleveService;

@Service
@Transactional(readOnly = false)
public class EleveService implements IEleveService {

	IEleveDAO iEleveDAO;

	public IEleveDAO getiEleveDAO() {
		return iEleveDAO;
	}

	public void setiEleveDAO(IEleveDAO iEleveDAO) {
		this.iEleveDAO = iEleveDAO;
	}

	@Transactional(readOnly = false)
	public void addEleve(Eleve eleve) {
		getiEleveDAO().addEleve(eleve);

	}

	@Transactional(readOnly = false)
	public void updateEleve(Eleve eleve) {
		getiEleveDAO().updateEleve(eleve);

	}
	@Transactional(readOnly = false)
	public void deleteEleve(Eleve eleve) {
		getiEleveDAO().deleteEleve(eleve);

	}
	
	public Eleve getEleveById(int id) {
		return getiEleveDAO().getEleveById(id);
	}

	public List<Eleve> getEleves() {
		return getiEleveDAO().getEleves();
	}

}
