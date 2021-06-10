package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false , unique = true)
	private int id;
	
	@Column (name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column (name = "nom", nullable = true, unique = false, length = 50)
	private String prenom;
	
	public void Client() {
		
	}
	
	public void Client(String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
