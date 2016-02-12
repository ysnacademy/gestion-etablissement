package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IAnneeScolaireDAO;
import com.ysnacademy.model.AnneeScolaire;
import com.ysnacademy.service.interfaces.IAnneeScolaireService;

@Service
@Transactional(readOnly = false)
public class AnneeScolaireService implements IAnneeScolaireService {

	IAnneeScolaireDAO iAnneeScolaireDAO;

	public IAnneeScolaireDAO getiAnneeScolaireDAO() {
		return iAnneeScolaireDAO;
	}

	public void setiAnneeScolaireDAO(IAnneeScolaireDAO iAnneeScolaireDAO) {
		this.iAnneeScolaireDAO = iAnneeScolaireDAO;
	}

	@Transactional(readOnly = false)
	public void addAnneeScolaire(AnneeScolaire anneeScolaire) {
		getiAnneeScolaireDAO().addAnneeScolaire(anneeScolaire);

	}

	@Transactional(readOnly = false)
	public void updateAnneeScolaire(AnneeScolaire anneeScolaire) {
		getiAnneeScolaireDAO().updateAnneeScolaire(anneeScolaire);

	}
	@Transactional(readOnly = false)
	public void deleteAnneeScolaire(AnneeScolaire anneeScolaire) {
		getiAnneeScolaireDAO().deleteAnneeScolaire(anneeScolaire);

	}
	
	public AnneeScolaire getAnneeScolaireById(int id) {
		return getiAnneeScolaireDAO().getAnneeScolaireById(id);
	}

	public List<AnneeScolaire> getAnneeScolaires() {
		return getiAnneeScolaireDAO().getAnneeScolaires();
	}

}
