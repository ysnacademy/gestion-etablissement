package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.SeanceCours;

public interface ISeanceCoursDAO {
	public void addSeanceCours(SeanceCours seanceCours);

	public void updateSeanceCours(SeanceCours seanceCours);

	public void deleteSeanceCours(SeanceCours seanceCours);

	public SeanceCours getSeanceCoursById(int id);

	public List<SeanceCours> getSeanceCourss();
}
