package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Employe;

public interface IEmployeDAO {
	public void addEmploye(Employe employe);

	public void updateEmploye(Employe employe);

	public void deleteEmploye(Employe employe);

	public Employe getEmployeById(int id);

	public List<Employe> getEmployes();
}
