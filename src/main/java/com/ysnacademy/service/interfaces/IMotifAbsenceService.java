package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.MotifAbsence;

public interface IMotifAbsenceService {
	public void addMotifAbsence(MotifAbsence motifAbsence);

	public void updateMotifAbsence(MotifAbsence motifAbsence);

	public void deleteMotifAbsence(MotifAbsence motifAbsence);

	public MotifAbsence getMotifAbsenceById(int id);

	public List<MotifAbsence> getMotifAbsences();
}
