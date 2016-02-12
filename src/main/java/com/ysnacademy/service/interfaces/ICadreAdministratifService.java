package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.CadreAdministratif;

public interface ICadreAdministratifService {
	public void addCadreAdministratif(CadreAdministratif cadreAdministratif);

	public void updateCadreAdministratif(CadreAdministratif cadreAdministratif);

	public void deleteCadreAdministratif(CadreAdministratif cadreAdministratif);

	public CadreAdministratif getCadreAdministratifById(int id);

	public List<CadreAdministratif> getCadreAdministratifs();
}
