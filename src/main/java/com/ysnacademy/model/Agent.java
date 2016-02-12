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
@Table(name = "agent", schema = "gestionetablissement")
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
public class Agent extends Employe{
	int idAgent;
	String fonction;

	
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	@Column(name = "fonction", nullable = false)
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	

}
