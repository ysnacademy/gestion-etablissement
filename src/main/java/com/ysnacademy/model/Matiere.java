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
@Table(name = "matiere", schema = "gestionetablissement")
public class Matiere {
	int idMatiere;
	String designation;
	float coefficient;
	List<Note> listNotes;
	List<SeanceCours> listSeanceCours;
	List<Enseignant> listEnseignant;
	
	

	@Id
	@Column(name = "idMatiere")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name = "coefficient", nullable = false)
	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	@OneToMany(mappedBy="matiere")
	public List<Enseignant> getListEnseignant() {
		return listEnseignant;
	}

	public void setListEnseignant(List<Enseignant> listEnseignant) {
		this.listEnseignant = listEnseignant;
	}

	@OneToMany(mappedBy="matiere")
	public List<SeanceCours> getListSeanceCours() {
		return listSeanceCours;
	}

	public void setListSeanceCours(List<SeanceCours> listSeanceCours) {
		this.listSeanceCours = listSeanceCours;
	}

	@OneToMany(mappedBy="matiere")
	public List<Note> getListNotes() {
		return listNotes;
	}

	public void setListNotes(List<Note> listNotes) {
		this.listNotes = listNotes;
	}


	
}
