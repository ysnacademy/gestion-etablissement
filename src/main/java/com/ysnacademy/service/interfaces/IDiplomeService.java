package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Diplome;

public interface IDiplomeService {
	public void addDiplome(Diplome diplome);

	public void updateDiplome(Diplome diplome);

	public void deleteDiplome(Diplome diplome);

	public Diplome getDiplomeById(int id);

	public List<Diplome> getDiplomes();
}
