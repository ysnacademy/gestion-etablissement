package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IClasseDAO;
import com.ysnacademy.model.Classe;
import com.ysnacademy.service.interfaces.IClasseService;

@Service
@Transactional(readOnly = false)
public class ClasseService implements IClasseService {

	IClasseDAO iClasseDAO;

	public IClasseDAO getiClasseDAO() {
		return iClasseDAO;
	}

	public void setiClasseDAO(IClasseDAO iClasseDAO) {
		this.iClasseDAO = iClasseDAO;
	}

	@Transactional(readOnly = false)
	public void addClasse(Classe classe) {
		getiClasseDAO().addClasse(classe);

	}

	@Transactional(readOnly = false)
	public void updateClasse(Classe classe) {
		getiClasseDAO().updateClasse(classe);

	}
	@Transactional(readOnly = false)
	public void deleteClasse(Classe classe) {
		getiClasseDAO().deleteClasse(classe);

	}
	
	public Classe getClasseById(int id) {
		return getiClasseDAO().getClasseById(id);
	}

	public List<Classe> getClasses() {
		return getiClasseDAO().getClasses();
	}

}
