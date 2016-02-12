package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.TuteurEleve;

public interface ITuteurEleveService {
	public void addTuteurEleve(TuteurEleve tuteurEleve);

	public void updateTuteurEleve(TuteurEleve tuteurEleve);

	public void deleteTuteurEleve(TuteurEleve tuteurEleve);

	public TuteurEleve getTuteurEleveById(int id);

	public List<TuteurEleve> getTuteurEleves();
}
