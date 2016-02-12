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
@Table(name = "diplome", schema = "gestionetablissement")
public class Diplome {
	
	int idDiplome;
	String designation;
	Date dateObtention;
	String lieuObtention;
	String mention;
	Employe employe;
	
	@Id
	@Column(name = "idDiplome")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(int idDiplome) {
		this.idDiplome = idDiplome;
	}
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name = "dateObtention", nullable = false)
	public Date getDateObtention() {
		return dateObtention;
	}

	public void setDateObtention(Date dateObtention) {
		this.dateObtention = dateObtention;
	}
	@Column(name = "lieuObtention", nullable = false)
	public String getLieuObtention() {
		return lieuObtention;
	}

	public void setLieuObtention(String lieuObtention) {
		this.lieuObtention = lieuObtention;
	}
	@Column(name = "mention", nullable = true)
	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	@ManyToOne
	@JoinColumn(name="idEmploye")
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	

}
