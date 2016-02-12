package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.MotifAbsence;

public interface IMotifAbsenceDAO {
	public void addMotifAbsence(MotifAbsence motifAbsence);

	public void updateMotifAbsence(MotifAbsence motifAbsence);

	public void deleteMotifAbsence(MotifAbsence motifAbsence);

	public MotifAbsence getMotifAbsenceById(int id);

	public List<MotifAbsence> getMotifAbsences();
}
