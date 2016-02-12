package com.ysnacademy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MotifAbsence", schema = "gestionetablissement")
public class MotifAbsence {
	int idMotifAbsence;
	String motif;
	

	List<AbsenceEleve> listAbsenceEleves;


	@Id
	@Column(name = "idMotifAbsence")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMotifAbsence() {
		return idMotifAbsence;
	}

	public void setIdMotifAbsence(int idMotifAbsence) {
		this.idMotifAbsence = idMotifAbsence;
	}
	@Column(name = "motif", nullable = false)
	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	@OneToMany(mappedBy="motifAbsence")
	public List<AbsenceEleve> getListAbsenceEleves() {
		return listAbsenceEleves;
	}

	public void setListAbsenceEleves(List<AbsenceEleve> listAbsenceEleves) {
		this.listAbsenceEleves = listAbsenceEleves;
	}
	

}
