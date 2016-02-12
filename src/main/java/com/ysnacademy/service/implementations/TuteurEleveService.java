package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.ITuteurEleveDAO;
import com.ysnacademy.model.TuteurEleve;
import com.ysnacademy.service.interfaces.ITuteurEleveService;

@Service
@Transactional(readOnly = false)
public class TuteurEleveService implements ITuteurEleveService {

	ITuteurEleveDAO iTuteurEleveDAO;

	public ITuteurEleveDAO getiTuteurEleveDAO() {
		return iTuteurEleveDAO;
	}

	public void setiTuteurEleveDAO(ITuteurEleveDAO iTuteurEleveDAO) {
		this.iTuteurEleveDAO = iTuteurEleveDAO;
	}

	@Transactional(readOnly = false)
	public void addTuteurEleve(TuteurEleve tuteurEleve) {
		getiTuteurEleveDAO().addTuteurEleve(tuteurEleve);

	}

	@Transactional(readOnly = false)
	public void updateTuteurEleve(TuteurEleve tuteurEleve) {
		getiTuteurEleveDAO().updateTuteurEleve(tuteurEleve);

	}
	@Transactional(readOnly = false)
	public void deleteTuteurEleve(TuteurEleve tuteurEleve) {
		getiTuteurEleveDAO().deleteTuteurEleve(tuteurEleve);

	}
	
	public TuteurEleve getTuteurEleveById(int id) {
		return getiTuteurEleveDAO().getTuteurEleveById(id);
	}

	public List<TuteurEleve> getTuteurEleves() {
		return getiTuteurEleveDAO().getTuteurEleves();
	}

}
