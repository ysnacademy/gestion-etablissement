package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Eleve;

public interface IEleveDAO {
	public void addEleve(Eleve eleve);

	public void updateEleve(Eleve eleve);

	public void deleteEleve(Eleve eleve);

	public Eleve getEleveById(int id);

	public List<Eleve> getEleves();
}
