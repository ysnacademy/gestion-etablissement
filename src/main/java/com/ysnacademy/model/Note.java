package com.ysnacademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "note", schema = "gestionetablissement")
public class Note {
	int idNote;
	float note;
	Eleve eleve;
	Bulletin bulletin;
	Matiere matiere;
	
	
	@Id
	@Column(name = "idNote")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdNote() {
		return idNote;
	}
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	@Column(name = "note", nullable = false)
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
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
	@JoinColumn(name="idBulletin")
	public Bulletin getBulletin() {
		return bulletin;
	}
	public void setBulletin(Bulletin bulletin) {
		this.bulletin = bulletin;
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
