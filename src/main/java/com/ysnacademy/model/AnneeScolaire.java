package com.ysnacademy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "anneeScolaire", schema = "gestionetablissement")
public class AnneeScolaire {
	int idAnneeScolaire;
	Date dateDebut;
	Date dateFin;
	String Description;
	boolean cloture;
	
	@Id
	@Column(name = "idDiplome")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAnneeScolaire() {
		return idAnneeScolaire;
	}
	public void setIdAnneeScolaire(int idAnneeScolaire) {
		this.idAnneeScolaire = idAnneeScolaire;
	}
	@Column(name="dateDebut" , nullable = false)
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	@Column(name="dateFin" , nullable = false)
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Column(name="Description" , nullable = false)
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Column(name="cloture" , nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean enabled;
	public boolean isCloture() {
		return cloture;
	}
	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}
	
	
	
	
	

}
