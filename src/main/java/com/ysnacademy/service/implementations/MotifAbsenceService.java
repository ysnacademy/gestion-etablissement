package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IMotifAbsenceDAO;
import com.ysnacademy.model.MotifAbsence;
import com.ysnacademy.service.interfaces.IMotifAbsenceService;

@Service
@Transactional(readOnly = false)
public class MotifAbsenceService implements IMotifAbsenceService {

	IMotifAbsenceDAO iMotifAbsenceDAO;

	public IMotifAbsenceDAO getiMotifAbsenceDAO() {
		return iMotifAbsenceDAO;
	}

	public void setiMotifAbsenceDAO(IMotifAbsenceDAO iMotifAbsenceDAO) {
		this.iMotifAbsenceDAO = iMotifAbsenceDAO;
	}

	@Transactional(readOnly = false)
	public void addMotifAbsence(MotifAbsence motifAbsence) {
		getiMotifAbsenceDAO().addMotifAbsence(motifAbsence);

	}

	@Transactional(readOnly = false)
	public void updateMotifAbsence(MotifAbsence motifAbsence) {
		getiMotifAbsenceDAO().updateMotifAbsence(motifAbsence);

	}
	@Transactional(readOnly = false)
	public void deleteMotifAbsence(MotifAbsence motifAbsence) {
		getiMotifAbsenceDAO().deleteMotifAbsence(motifAbsence);

	}
	
	public MotifAbsence getMotifAbsenceById(int id) {
		return getiMotifAbsenceDAO().getMotifAbsenceById(id);
	}

	public List<MotifAbsence> getMotifAbsences() {
		return getiMotifAbsenceDAO().getMotifAbsences();
	}

}
