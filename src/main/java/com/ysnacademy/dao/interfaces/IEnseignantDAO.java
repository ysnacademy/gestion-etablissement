package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Enseignant;

public interface IEnseignantDAO {
	public void addEnseignant(Enseignant enseignant);

	public void updateEnseignant(Enseignant enseignant);

	public void deleteEnseignant(Enseignant enseignant);

	public Enseignant getEnseignantById(int id);

	public List<Enseignant> getEnseignants();
}
