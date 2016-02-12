package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.ISeanceCoursDAO;
import com.ysnacademy.model.SeanceCours;
import com.ysnacademy.service.interfaces.ISeanceCoursService;

@Service
@Transactional(readOnly = false)
public class SeanceCoursService implements ISeanceCoursService {

	ISeanceCoursDAO iSeanceCoursDAO;

	public ISeanceCoursDAO getiSeanceCoursDAO() {
		return iSeanceCoursDAO;
	}

	public void setiSeanceCoursDAO(ISeanceCoursDAO iSeanceCoursDAO) {
		this.iSeanceCoursDAO = iSeanceCoursDAO;
	}

	@Transactional(readOnly = false)
	public void addSeanceCours(SeanceCours seanceCours) {
		getiSeanceCoursDAO().addSeanceCours(seanceCours);

	}

	@Transactional(readOnly = false)
	public void updateSeanceCours(SeanceCours seanceCours) {
		getiSeanceCoursDAO().updateSeanceCours(seanceCours);

	}
	@Transactional(readOnly = false)
	public void deleteSeanceCours(SeanceCours seanceCours) {
		getiSeanceCoursDAO().deleteSeanceCours(seanceCours);

	}
	
	public SeanceCours getSeanceCoursById(int id) {
		return getiSeanceCoursDAO().getSeanceCoursById(id);
	}

	public List<SeanceCours> getSeanceCourss() {
		return getiSeanceCoursDAO().getSeanceCourss();
	}

}
