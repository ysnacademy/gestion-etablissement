package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Enseignant;

public interface IEnseignantService {
	public void addEnseignant(Enseignant enseignant);

	public void updateEnseignant(Enseignant enseignant);

	public void deleteEnseignant(Enseignant enseignant);

	public Enseignant getEnseignantById(int id);

	public List<Enseignant> getEnseignants();
}
