package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.TuteurEleve;

public interface ITuteurEleveDAO {
	public void addTuteurEleve(TuteurEleve tuteurEleve);

	public void updateTuteurEleve(TuteurEleve tuteurEleve);

	public void deleteTuteurEleve(TuteurEleve tuteurEleve);

	public TuteurEleve getTuteurEleveById(int id);

	public List<TuteurEleve> getTuteurEleves();
}
