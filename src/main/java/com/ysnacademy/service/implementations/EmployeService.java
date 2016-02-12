package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IEmployeDAO;
import com.ysnacademy.model.Employe;
import com.ysnacademy.service.interfaces.IEmployeService;

@Service
@Transactional(readOnly = false)
public class EmployeService implements IEmployeService {

	IEmployeDAO iEmployeDAO;

	public IEmployeDAO getiEmployeDAO() {
		return iEmployeDAO;
	}

	public void setiEmployeDAO(IEmployeDAO iEmployeDAO) {
		this.iEmployeDAO = iEmployeDAO;
	}

	@Transactional(readOnly = false)
	public void addEmploye(Employe employe) {
		getiEmployeDAO().addEmploye(employe);

	}

	@Transactional(readOnly = false)
	public void updateEmploye(Employe employe) {
		getiEmployeDAO().updateEmploye(employe);

	}
	@Transactional(readOnly = false)
	public void deleteEmploye(Employe employe) {
		getiEmployeDAO().deleteEmploye(employe);

	}
	
	public Employe getEmployeById(int id) {
		return getiEmployeDAO().getEmployeById(id);
	}

	public List<Employe> getEmployes() {
		return getiEmployeDAO().getEmployes();
	}

}
