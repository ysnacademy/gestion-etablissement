package com.ysnacademy.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cadreAdministratif", schema = "gestionetablissement")
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
public class CadreAdministratif extends Employe {
	
	int idCadreAdministratif;
	String fonction;
	String grade;
	

	public int getIdCadreAdministratif() {
		return idCadreAdministratif;
	}
	public void setIdCadreAdministratif(int idCadreAdministratif) {
		this.idCadreAdministratif = idCadreAdministratif;
	}
	@Column(name = "fonction", nullable = false)
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@Column(name = "grade", nullable = false)
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
