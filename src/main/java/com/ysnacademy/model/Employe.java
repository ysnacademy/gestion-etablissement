package com.ysnacademy.model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employe", schema = "gestionetablissement")
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
public class Employe extends Personne{
	int idEmploye;
	float salaire;
	Date dateEmbauche;
	String situationFamiliale;
	int nbrEnfant;
	List<Diplome> listDiplomes;
	
	
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	@Column(name = "salaire", nullable = false)
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	@Column(name = "dateEmbauche", nullable = false)
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	@Column(name = "situationFamiliale", nullable = false)
	public String getSituationFamiliale() {
		return situationFamiliale;
	}
	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	@Column(name = "nbrEnfant", nullable = false)
	public int getNbrEnfant() {
		return nbrEnfant;
	}
	public void setNbrEnfant(int nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employe", cascade = CascadeType.ALL)
	public List<Diplome> getListDiplomes() {
		return listDiplomes;
	}
	public void setListDiplomes(List<Diplome> listDiplomes) {
		this.listDiplomes = listDiplomes;
	}
	
	

}
