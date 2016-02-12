package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Eleve;

public interface IEleveService {
	public void addEleve(Eleve eleve);

	public void updateEleve(Eleve eleve);

	public void deleteEleve(Eleve eleve);

	public Eleve getEleveById(int id);

	public List<Eleve> getEleves();
}
