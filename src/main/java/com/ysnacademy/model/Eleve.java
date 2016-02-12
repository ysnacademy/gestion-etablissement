package com.ysnacademy.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "eleve", schema = "gestionetablissement")
@AttributeOverrides({
    @AttributeOverride(name="nom", column=@Column(name="nom")),
    @AttributeOverride(name="prenom", column=@Column(name="prenom")),
    @AttributeOverride(name="email", column=@Column(name="email")),
    @AttributeOverride(name="dateNaissance", column=@Column(name="dateNaissance")),
    @AttributeOverride(name="telMobile", column=@Column(name="telMobile")),
    @AttributeOverride(name="telDomicile", column=@Column(name="telDomicile")),
    @AttributeOverride(name="genre", column=@Column(name="genre")),
    @AttributeOverride(name="cin", column=@Column(name="cin"))
    
})
public class Eleve extends Personne{
	
	int idEleve;
	long CNE;
	boolean abandonnement;

	TuteurEleve tuteurEleve;

	List<Note> listNotes;

	public int getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}
	@Column(name = "CNE", nullable = false)
	public long getCNE() {
		return CNE;
	}

	public void setCNE(long cNE) {
		CNE = cNE;
	}
	@Column(name="abandonnement" , nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isAbandonnement() {
		return abandonnement;
	}

	public void setAbandonnement(boolean abandonnement) {
		this.abandonnement = abandonnement;
	}

	@OneToMany(mappedBy="eleve")
	public List<Note> getListNotes() {
		return listNotes;
	}

	public void setListNotes(List<Note> listNotes) {
		this.listNotes = listNotes;
	}

	@ManyToOne
	@JoinColumn(name="idTuteurEleve")
	public TuteurEleve getTuteurEleve() {
		return tuteurEleve;
	}

	public void setTuteurEleve(TuteurEleve tuteurEleve) {
		this.tuteurEleve = tuteurEleve;
	}
	
}
