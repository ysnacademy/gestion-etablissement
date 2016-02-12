package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IInscriptionDAO;
import com.ysnacademy.model.Inscription;
import com.ysnacademy.service.interfaces.IInscriptionService;

@Service
@Transactional(readOnly = false)
public class InscriptionService implements IInscriptionService {

	IInscriptionDAO iInscriptionDAO;

	public IInscriptionDAO getiInscriptionDAO() {
		return iInscriptionDAO;
	}

	public void setiInscriptionDAO(IInscriptionDAO iInscriptionDAO) {
		this.iInscriptionDAO = iInscriptionDAO;
	}

	@Transactional(readOnly = false)
	public void addInscription(Inscription inscription) {
		getiInscriptionDAO().addInscription(inscription);

	}

	@Transactional(readOnly = false)
	public void updateInscription(Inscription inscription) {
		getiInscriptionDAO().updateInscription(inscription);

	}
	@Transactional(readOnly = false)
	public void deleteInscription(Inscription inscription) {
		getiInscriptionDAO().deleteInscription(inscription);

	}
	
	public Inscription getInscriptionById(int id) {
		return getiInscriptionDAO().getInscriptionById(id);
	}

	public List<Inscription> getInscriptions() {
		return getiInscriptionDAO().getInscriptions();
	}

}
