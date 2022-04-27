package com.vintud;


public class UserImp {
	
	private String nom,prenom,mail,pseudo,adresse,motPasse,numTele,listeAnnonceP,listeAnnonceF;
	private int id,role_id;
	
		public  UserImp (String numTele,int id,int role_id,String nom,String prenom,String mail,String pseudo,String adresse,String motPasse,String listeAnnonceP,String listeAnnonceF) {
			this.numTele=numTele;
			this.nom=nom;
			this.prenom=prenom;
			this.mail=mail;
			this.pseudo=pseudo;
			this.adresse=adresse;
			this.motPasse=motPasse;
			this.role_id=role_id;
			this.id=id;
			this.listeAnnonceP=listeAnnonceP;
			this.listeAnnonceF=listeAnnonceF;
		}
		
		public  UserImp () {
			
		}
		
		//getter_setter
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

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getPseudo() {
			return pseudo;
		}

		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getMotPasse() {
			return motPasse;
		}

		public void setMotPasse(String motPasse) {
			this.motPasse = motPasse;
		}

		public String getNumTele() {
			return numTele;
		}

		public void setNumTele(String numTele) {
			this.numTele = numTele;
		}
		
		public int getRole_id() {
			return role_id;
		}

		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getListeAnnonceP() {
			return listeAnnonceP;
		}

		public void setListeAnnonceP(String listeAnnonceP) {
			this.listeAnnonceP = listeAnnonceP;
		}

		public String getListeAnnonceF() {
			return listeAnnonceF;
		}

		public void setListeAnnonceF(String listeAnnonceF) {
			this.listeAnnonceF = listeAnnonceF;
		}

}
