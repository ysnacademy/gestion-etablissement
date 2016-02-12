package com.ysnacademy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seanceCours", schema = "gestionetablissement")
public class SeanceCours {
	int idSeanceCours;
	Date dateDebut;
	Date duree;
	String typeSeance;
	Matiere matiere;

	@Id
	@Column(name = "idSeanceCours")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdSeanceCours() {
		return idSeanceCours;
	}

	public void setIdSeanceCours(int idSeanceCours) {
		this.idSeanceCours = idSeanceCours;
	}
	@Column(name = "dateDebut", nullable = false)
	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	@Column(name = "duree", nullable = false)
	public Date getDuree() {
		return duree;
	}

	public void setDuree(Date duree) {
		this.duree = duree;
	}
	@Column(name = "typeSeance", nullable = false)
	public String getTypeSeance() {
		return typeSeance;
	}

	public void setTypeSeance(String typeSeance) {
		this.typeSeance = typeSeance;
	}

	@ManyToOne
	@JoinColumn(name="idMatiere")
	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	
}
