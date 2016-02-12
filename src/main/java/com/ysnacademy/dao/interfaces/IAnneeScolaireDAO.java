package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.AnneeScolaire;

public interface IAnneeScolaireDAO {
	
	public void addAnneeScolaire(AnneeScolaire anneeScolaire);

	public void updateAnneeScolaire(AnneeScolaire anneeScolaire);

	public void deleteAnneeScolaire(AnneeScolaire anneeScolaire);

	public AnneeScolaire getAnneeScolaireById(int id);

	public List<AnneeScolaire> getAnneeScolaires();
}
