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
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "absenceEleve", schema = "gestionetablissement")
public class AbsenceEleve {
	int idAbsenceEleve;
	Date dateDebut;
	Date dateFin;
	boolean justifiee;
	String remarque;
	
	SeanceCours seanceCours;
	Eleve eleve;
	MotifAbsence motifAbsence;
	
	
	@Id
	@Column(name = "idAbsenceEleve")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAbsenceEleve() {
		return idAbsenceEleve;
	}
	public void setIdAbsenceEleve(int idAbsenceEleve) {
		this.idAbsenceEleve = idAbsenceEleve;
	}
	@Column(name = "dateDebut", nullable = false)
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	@Column(name = "dateFin", nullable = false)
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Column(name="justifiee" , nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isJustifiee() {
		return justifiee;
	}
	public void setJustifiee(boolean justifiee) {
		this.justifiee = justifiee;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	@ManyToOne
	@JoinColumn(name="idSeanceCours")
	public SeanceCours getSeanceCours() {
		return seanceCours;
	}
	public void setSeanceCours(SeanceCours seanceCours) {
		this.seanceCours = seanceCours;
	}
	@ManyToOne
	@JoinColumn(name="idEleve")
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	@ManyToOne
	@JoinColumn(name="idMotifAbsence")
	public MotifAbsence getMotifAbsence() {
		return motifAbsence;
	}
	public void setMotifAbsence(MotifAbsence motifAbsence) {
		this.motifAbsence = motifAbsence;
	}
	
	
}
