package com.ysnacademy.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enseignant", schema = "gestionetablissement")
@AttributeOverrides({
    @AttributeOverride(name="nom", column=@Column(name="nom")),
    @AttributeOverride(name="prenom", column=@Column(name="prenom")),
    @AttributeOverride(name="email", column=@Column(name="email")),
    @AttributeOverride(name="dateNaissance", column=@Column(name="dateNaissance")),
    @AttributeOverride(name="telMobile", column=@Column(name="telMobile")),
    @AttributeOverride(name="telDomicile", column=@Column(name="telDomicile")),
    @AttributeOverride(name="genre", column=@Column(name="genre")),
    @AttributeOverride(name="cin", column=@Column(name="cin")),
    @AttributeOverride(name="salaire", column=@Column(name="salaire")),
    @AttributeOverride(name="dateEmbauche", column=@Column(name="dateEmbauche")),
    @AttributeOverride(name="situationFamiliale", column=@Column(name="situationFamiliale")),
    @AttributeOverride(name="nbrEnfant", column=@Column(name="nbrEnfant"))
    
})
public class Enseignant extends Employe{
	int idEnseignant;
	String echelle;
	String echellon;
	
	List<Classe> listClasses;
	Matiere matiere;
	

	public int getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	@Column(name = "echelle", nullable = false)
	public String getEchelle() {
		return echelle;
	}

	public void setEchelle(String echelle) {
		this.echelle = echelle;
	}
	@Column(name = "echellon", nullable = false)
	public String getEchellon() {
		return echellon;
	}

	public void setEchellon(String echellon) {
		this.echellon = echellon;
	}

	@ManyToOne
	@JoinColumn(name="idMatiere")
	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "enseignant_classe", catalog = "gestionetablissement", joinColumns = { 
			@JoinColumn(name = "idEnseignant", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idClasse", 
					nullable = false, updatable = false) })
	public List<Classe> getListClasses() {
		return listClasses;
	}

	public void setListClasses(List<Classe> listClasses) {
		this.listClasses = listClasses;
	}
	 	
}
