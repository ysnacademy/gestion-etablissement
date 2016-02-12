package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Agent;



public interface IAgentDAO {
	
	public void addAgent(Agent agent);

	public void updateAgent(Agent agent);

	public void deleteAgent(Agent agent);

	public Agent getAgentById(int id);

	public List<Agent> getAgents();
}
