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
@Table(name = "bulletin", schema = "gestionetablissement")
public class Bulletin {
	
	int idBulletin;
	String appreciation;
	float noteFinale;
	
	List<Note> listNotes;
	Periode periode;
	
	@Id
	@Column(name = "idBulletin")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdBulletin() {
		return idBulletin;
	}

	public void setIdBulletin(int idBulletin) {
		this.idBulletin = idBulletin;
	}
	@Column(name = "appreciation", nullable = false)
	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	@Column(name = "noteFinale", nullable = false)
	public float getNoteFinale() {
		return noteFinale;
	}

	public void setNoteFinale(float noteFinale) {
		this.noteFinale = noteFinale;
	}

	@ManyToOne
	@JoinColumn(name="idPeriode")
	public Periode getPeriode() {
		return periode;
	}

	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	@OneToMany(mappedBy="bulletin")
	public List<Note> getListNotes() {
		return listNotes;
	}

	public void setListNotes(List<Note> listNotes) {
		this.listNotes = listNotes;
	}
	

}
