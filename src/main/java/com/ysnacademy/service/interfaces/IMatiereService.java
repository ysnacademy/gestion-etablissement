package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Matiere;

public interface IMatiereService {
	public void addMatiere(Matiere matiere);

	public void updateMatiere(Matiere matiere);

	public void deleteMatiere(Matiere matiere);

	public Matiere getMatiereById(int id);

	public List<Matiere> getMatieres();
}
