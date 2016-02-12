package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Inscription;

public interface IInscriptionDAO {
	public void addInscription(Inscription inscription);

	public void updateInscription(Inscription inscription);

	public void deleteInscription(Inscription inscription);

	public Inscription getInscriptionById(int id);

	public List<Inscription> getInscriptions();
}
