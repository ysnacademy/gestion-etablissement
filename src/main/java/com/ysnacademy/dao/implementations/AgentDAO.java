package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.IAgentDAO;
import com.ysnacademy.model.Agent;


public class AgentDAO implements IAgentDAO{

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAgent(Agent agent) {
		getSessionFactory().getCurrentSession().save(agent);

	}

	public void updateAgent(Agent agent) {
		getSessionFactory().getCurrentSession().update(agent);


	}

	public void deleteAgent(Agent agent) {
		getSessionFactory().getCurrentSession().delete(agent);


	}

	public Agent getAgentById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from agent where id=?")
		                 .setParameter(0, id).list();
		  return (Agent)list.get(0);
	}

	public List<Agent> getAgents() {
		List list = getSessionFactory().getCurrentSession().createQuery("from agent").list();
		  return list;
	}
	

}
