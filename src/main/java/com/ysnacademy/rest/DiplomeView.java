package com.ysnacademy.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ysnacademy.model.Diplome;
import com.ysnacademy.service.interfaces.IDiplomeService;


@Component
@Path("/diplome")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DiplomeView {

	
	@Autowired
	IDiplomeService diplomeService;

	public IDiplomeService getDiplomeService() {
		return diplomeService;
	}

	public void setDiplomeService(IDiplomeService diplomeService) {
		this.diplomeService = diplomeService;
	}
	
	@GET
	public List<Diplome> getAllDiplome() {

		ArrayList<Diplome> listDiplome = (ArrayList<Diplome>) getDiplomeService()
				.getDiplomes();
		return listDiplome;
	}
	
	@POST
	public String addDiplome(Diplome diplome) {
		getDiplomeService().addDiplome(diplome);
		return "post works";
	}
	
	
}
