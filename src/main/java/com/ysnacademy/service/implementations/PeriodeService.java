package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IPeriodeDAO;
import com.ysnacademy.model.Periode;
import com.ysnacademy.service.interfaces.IPeriodeService;

@Service
@Transactional(readOnly = false)
public class PeriodeService implements IPeriodeService {

	IPeriodeDAO iPeriodeDAO;

	public IPeriodeDAO getiPeriodeDAO() {
		return iPeriodeDAO;
	}

	public void setiPeriodeDAO(IPeriodeDAO iPeriodeDAO) {
		this.iPeriodeDAO = iPeriodeDAO;
	}

	@Transactional(readOnly = false)
	public void addPeriode(Periode periode) {
		getiPeriodeDAO().addPeriode(periode);

	}

	@Transactional(readOnly = false)
	public void updatePeriode(Periode periode) {
		getiPeriodeDAO().updatePeriode(periode);

	}
	@Transactional(readOnly = false)
	public void deletePeriode(Periode periode) {
		getiPeriodeDAO().deletePeriode(periode);

	}
	
	public Periode getPeriodeById(int id) {
		return getiPeriodeDAO().getPeriodeById(id);
	}

	public List<Periode> getPeriodes() {
		return getiPeriodeDAO().getPeriodes();
	}

}
