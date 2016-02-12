package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IBulletinDAO;
import com.ysnacademy.model.Bulletin;
import com.ysnacademy.service.interfaces.IBulletinService;

@Service
@Transactional(readOnly = false)
public class BulletinService implements IBulletinService {

	IBulletinDAO iBulletinDAO;

	public IBulletinDAO getiBulletinDAO() {
		return iBulletinDAO;
	}

	public void setiBulletinDAO(IBulletinDAO iBulletinDAO) {
		this.iBulletinDAO = iBulletinDAO;
	}

	@Transactional(readOnly = false)
	public void addBulletin(Bulletin bulletin) {
		getiBulletinDAO().addBulletin(bulletin);

	}

	@Transactional(readOnly = false)
	public void updateBulletin(Bulletin bulletin) {
		getiBulletinDAO().updateBulletin(bulletin);

	}
	@Transactional(readOnly = false)
	public void deleteBulletin(Bulletin bulletin) {
		getiBulletinDAO().deleteBulletin(bulletin);

	}
	
	public Bulletin getBulletinById(int id) {
		return getiBulletinDAO().getBulletinById(id);
	}

	public List<Bulletin> getBulletins() {
		return getiBulletinDAO().getBulletins();
	}

}
