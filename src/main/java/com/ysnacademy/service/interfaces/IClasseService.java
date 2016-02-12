package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Classe;

public interface IClasseService {
	public void addClasse(Classe classe);

	public void updateClasse(Classe classe);

	public void deleteClasse(Classe classe);

	public Classe getClasseById(int id);

	public List<Classe> getClasses();
}
