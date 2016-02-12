package com.ysnacademy.model;

import java.util.Date;
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

import org.hibernate.annotations.Type;

@Entity
@Table(name = "periode", schema = "gestionetablissement")
public class Periode {
	int idPeriode;
	String designation;
	Date dateDebut;
	Date dateFin;
	boolean cloture;
	AnneeScolaire anneeScolaire;
	List<Bulletin> listBulletins;
	
	
	@Id
	@Column(name = "idPeriode")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdPeriode() {
		return idPeriode;
	}
	public void setIdPeriode(int idPeriode) {
		this.idPeriode = idPeriode;
	}
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	@Column(name="cloture" , nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isCloture() {
		return cloture;
	}
	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}
	@ManyToOne
	@JoinColumn(name="idAnneeScolaire")
	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	
	@OneToMany(mappedBy="periode")
	public List<Bulletin> getListBulletins() {
		return listBulletins;
	}
	public void setListBulletins(List<Bulletin> listBulletins) {
		this.listBulletins = listBulletins;
	}
	
	
}
