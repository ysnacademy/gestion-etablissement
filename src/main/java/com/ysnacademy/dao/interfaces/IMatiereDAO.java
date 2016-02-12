package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Matiere;

public interface IMatiereDAO {
	public void addMatiere(Matiere matiere);

	public void updateMatiere(Matiere matiere);

	public void deleteMatiere(Matiere matiere);

	public Matiere getMatiereById(int id);

	public List<Matiere> getMatieres();
}
