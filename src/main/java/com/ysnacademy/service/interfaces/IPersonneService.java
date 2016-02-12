package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Personne;

public interface IPersonneService {
	
	public void addPersonne(Personne personne);

	public void updatePersonne(Personne personne);

	public void deletePersonne(Personne personne);

	public Personne getPersonneById(int id);

	public List<Personne> getPersonnes();
}
