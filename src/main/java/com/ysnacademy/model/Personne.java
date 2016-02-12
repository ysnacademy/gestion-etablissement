package com.ysnacademy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "personne")
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private String email;
	private Date dateNaissance;
	private String telMobile;
	private String telDomicile;
	private String genre;
	private String cin;

	// private Image image;
	
	public Personne(int id, String nom, String prenom, String email,
			Date dateNaissance, String telMobile, String telDomicile,
			String genre, String cin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.telMobile = telMobile;
		this.telDomicile = telDomicile;
		this.genre = genre;
		this.cin = cin;
	}

	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@Column(name = "idPersonne")
	@GeneratedValue(strategy = GenerationType.TABLE)
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nom", nullable = false)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "dateNaissance", nullable = false)
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column(name = "telMobile", nullable = true)
	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	@Column(name = "telDomicile", nullable = true)
	public String getTelDomicile() {
		return telDomicile;
	}

	public void setTelDomicile(String telDomicile) {
		this.telDomicile = telDomicile;
	}

	@Column(name = "genre", nullable = false)
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Column(name = "cin", nullable = false)
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	/*
	 * // @Column(name = "image", nullable = true) public Image getImage() {
	 * return image; }
	 * 
	 * public void setImage(Image image) { this.image = image; }
	 */

}
