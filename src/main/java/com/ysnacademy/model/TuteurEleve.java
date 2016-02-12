package com.ysnacademy.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tuteurEleve", schema = "gestionetablissement")
@AttributeOverrides({
		@AttributeOverride(name = "nom", column = @Column(name = "nom")),
		@AttributeOverride(name = "prenom", column = @Column(name = "prenom")),
		@AttributeOverride(name = "email", column = @Column(name = "email")),
		@AttributeOverride(name = "dateNaissance", column = @Column(name = "dateNaissance")),
		@AttributeOverride(name = "telMobile", column = @Column(name = "telMobile")),
		@AttributeOverride(name = "telDomicile", column = @Column(name = "telDomicile")),
		@AttributeOverride(name = "genre", column = @Column(name = "genre")),
		@AttributeOverride(name = "cin", column = @Column(name = "cin"))

})
public class TuteurEleve extends Personne {
	int idTuteurEleve;
	String profession;

	List<Eleve> listEleves;

	public int getIdTuteurEleve() {
		return idTuteurEleve;
	}

	public void setIdTuteurEleve(int idTuteurEleve) {
		this.idTuteurEleve = idTuteurEleve;
	}

	@Column(name = "profession", nullable = false)
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@OneToMany(mappedBy = "tuteurEleve")
	public List<Eleve> getListEleves() {
		return listEleves;
	}

	public void setListEleves(List<Eleve> listEleves) {
		this.listEleves = listEleves;
	}

}
