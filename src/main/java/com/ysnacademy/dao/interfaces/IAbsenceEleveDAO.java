package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.AbsenceEleve;


public interface IAbsenceEleveDAO {
	public void addAbsenceEleve(AbsenceEleve absenceEleve);

	public void updateAbsenceEleve(AbsenceEleve absenceEleve);

	public void deleteAbsenceEleve(AbsenceEleve absenceEleve);

	public AbsenceEleve getAbsenceEleveById(int id);

	public List<AbsenceEleve> getAbsenceEleves();
}
