package com.ysnacademy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classe", schema = "gestionetablissement")
public class Classe {
	int idClasse;
	String designation;
	int capaciteAccueil;
	int nbrEleve;
	
	List<Enseignant> listEnseignants;
	
	@Id
	@Column(name = "idClasse")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name = "capaciteAccueil", nullable = false)
	public int getCapaciteAccueil() {
		return capaciteAccueil;
	}

	public void setCapaciteAccueil(int capaciteAccueil) {
		this.capaciteAccueil = capaciteAccueil;
	}
	@Column(name = "nbrEleve", nullable = false)
	public int getNbrEleve() {
		return nbrEleve;
	}

	public void setNbrEleve(int nbrEleve) {
		this.nbrEleve = nbrEleve;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "listClasses")
	public List<Enseignant> getListEnseignants() {
		return listEnseignants;
	}

	public void setListEnseignants(List<Enseignant> listEnseignants) {
		this.listEnseignants = listEnseignants;
	}
	

}
