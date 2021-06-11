package com.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private int client_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private int produit_id;
	
	@Column(name = "date", nullable = true, unique = false, length = 50)
	private String date;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private Set<Produit> produits;


	public Commande() {
		super();
	}

	public Commande(int client_id, int produit_id, String date) {
		super();
		this.client_id = client_id;
		this.produit_id = produit_id;
		this.date = date;
	}

}