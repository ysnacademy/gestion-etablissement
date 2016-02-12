package com.ysnacademy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inscription", schema = "gestionetablissement")
public class Inscription {
	int idInscription;
	String description;
	
	AnneeScolaire anneeScolaire;
	Classe classe;
	List<Eleve> listEleves;
	
	@Id
	@Column(name = "idInscription")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdInscription() {
		return idInscription;
	}
	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}
	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne
	@JoinColumn(name="idAnneeScolaire")
	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	@ManyToOne
	@JoinColumn(name="idClasse")
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	@OneToMany
	@JoinColumn(name="idEleve")
	public List<Eleve> getListEleves() {
		return listEleves;
	}
	public void setListEleves(List<Eleve> listEleves) {
		this.listEleves = listEleves;
	}
	
	

}
