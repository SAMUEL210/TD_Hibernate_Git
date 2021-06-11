CREATE TABLE Client(
	id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nom VARCHAR(50),
	prenom VARCHAR(50)
);

CREATE TABLE Produit(
	id INT(11) NOT NULl AUTO_INCREMENT PRIMARY KEY ,
	marque VARCHAR(50),
	reference VARCHAR(50) NOT NULL,
	dateAchat VARCHAR(50),
	prix DOUBLE(6,3),
	designation VARCHAR(50),
	client_id INT(11),
	FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Commande(
	id INT(11) NOT NULL AUTO_INCREMENT,
	client_id INT(11),
	produit_id INT(11),
	date VARCHAR(10),
	PRIMARY KEY (id, client_id, produit_id),
	FOREIGN KEY (client_id) REFERENCES Client(id),
	FOREIGN KEY (produit_id) REFERENCES Produit(id)
);
