package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Periode;

public interface IPeriodeService {
	public void addPeriode(Periode periode);

	public void updatePeriode(Periode periode);

	public void deletePeriode(Periode periode);

	public Periode getPeriodeById(int id);

	public List<Periode> getPeriodes();
}
