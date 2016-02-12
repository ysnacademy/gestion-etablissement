package com.ysnacademy.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ysnacademy.model.Personne;
import com.ysnacademy.service.interfaces.IPersonneService;

@Component
@Path("/personne")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonneView {

	// bean already injected
	@Autowired
	IPersonneService personneService;

	public IPersonneService getPersonneService() {
		return personneService;
	}

	public void setPersonneService(IPersonneService personneService) {
		this.personneService = personneService;
	}

	@GET
	public List<Personne> getAllPersonne() {

		ArrayList<Personne> listPersonne = (ArrayList<Personne>) getPersonneService()
				.getPersonnes();
		return listPersonne;
	}

	@GET
	@Path("/{personneId}")
	public Personne getPersonneById(@PathParam("personneId") int personneId) {

		Personne personne = (Personne) getPersonneService().getPersonneById(
				personneId);
		return personne;
	}

	@POST
	public String addPersonne(Personne personne) {
		getPersonneService().addPersonne(personne);
		return "post works";
	}
	
	@PUT
	@Path("/{personneId}")
	public String updatePersonne(@PathParam("personneId") int idPersonne,Personne personne){
		
		personne.setId(idPersonne);
		getPersonneService().updatePersonne(personne);
		return "put works";
	}
	
	@DELETE
	@Path("/{personneId}")
	public String deletePersonne(@PathParam("personneId") int idPersonne){
		Personne personne=new Personne();
		personne.setId(idPersonne);
		getPersonneService().deletePersonne(personne);
		return "delete works";
	}

}