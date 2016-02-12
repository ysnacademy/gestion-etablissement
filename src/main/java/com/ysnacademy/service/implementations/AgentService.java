package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.IAgentDAO;
import com.ysnacademy.model.Agent;
import com.ysnacademy.service.interfaces.IAgentService;

@Service
@Transactional(readOnly = false)
public class AgentService implements IAgentService {

	IAgentDAO iAgentDAO;

	public IAgentDAO getiAgentDAO() {
		return iAgentDAO;
	}

	public void setiAgentDAO(IAgentDAO iAgentDAO) {
		this.iAgentDAO = iAgentDAO;
	}

	@Transactional(readOnly = false)
	public void addAgent(Agent agent) {
		getiAgentDAO().addAgent(agent);

	}

	@Transactional(readOnly = false)
	public void updateAgent(Agent agent) {
		getiAgentDAO().updateAgent(agent);

	}
	@Transactional(readOnly = false)
	public void deleteAgent(Agent agent) {
		getiAgentDAO().deleteAgent(agent);

	}
	
	public Agent getAgentById(int id) {
		return getiAgentDAO().getAgentById(id);
	}

	public List<Agent> getAgents() {
		return getiAgentDAO().getAgents();
	}

}
