package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IAbsenceEleveDAO;
import com.ysnacademy.model.AbsenceEleve;
import com.ysnacademy.service.interfaces.IAbsenceEleveService;

@Service
@Transactional(readOnly = false)
public class AbsenceEleveService implements IAbsenceEleveService {
	@Autowired
	IAbsenceEleveDAO iAbsenceEleveDAO;

	public IAbsenceEleveDAO getiAbsenceEleveDAO() {
		return iAbsenceEleveDAO;
	}

	public void setiAbsenceEleveDAO(IAbsenceEleveDAO iAbsenceEleveDAO) {
		this.iAbsenceEleveDAO = iAbsenceEleveDAO;
	}

	@Transactional(readOnly = false)
	public void addAbsenceEleve(AbsenceEleve absenceEleve) {
		getiAbsenceEleveDAO().addAbsenceEleve(absenceEleve);

	}

	@Transactional(readOnly = false)
	public void updateAbsenceEleve(AbsenceEleve absenceEleve) {
		getiAbsenceEleveDAO().updateAbsenceEleve(absenceEleve);

	}
	@Transactional(readOnly = false)
	public void deleteAbsenceEleve(AbsenceEleve absenceEleve) {
		getiAbsenceEleveDAO().deleteAbsenceEleve(absenceEleve);

	}
	
	public AbsenceEleve getAbsenceEleveById(int id) {
		return getiAbsenceEleveDAO().getAbsenceEleveById(id);
	}

	public List<AbsenceEleve> getAbsenceEleves() {
		return getiAbsenceEleveDAO().getAbsenceEleves();
	}

}
