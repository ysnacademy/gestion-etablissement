package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Bulletin;

public interface IBulletinService {
	public void addBulletin(Bulletin bulletin);

	public void updateBulletin(Bulletin bulletin);

	public void deleteBulletin(Bulletin bulletin);

	public Bulletin getBulletinById(int id);

	public List<Bulletin> getBulletins();
}
