package com.SpringVintud.SpringVintud;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity @Table (name="users")
public class UserImp  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private long id;
	@Column( name="first_name" )
	private String nom;
	@Column( name="last_name" )
	private String prenom;
	@Column( name="mail" )
	private String mail;
	@Column( name="pseudo" )
	private String pseudo;
	@Column( name="address" )
	private String adresse;
	@Column( name="u_password" )
	private String motPasse;
	@Column( name="phone" )
	private String numTele;	
	@Column( name="role_id" )
	private long role_id;
	List<AnnouncementImpl> listeAnnonce= new ArrayList<AnnouncementImpl>();
	List<AnnouncementImpl> listeAnnonceF= new ArrayList<AnnouncementImpl>();	
	
		public  UserImp (String nom,String prenom, String pseudo, String mail, String motPasse, String numTele, String adresse, long role_id,long id) {
			this.id=id;
			this.numTele=numTele;
			this.nom=nom;
			this.prenom=prenom;
			this.mail=mail;
			this.pseudo=pseudo;
			this.adresse=adresse;
			this.motPasse=motPasse;
			this.role_id=role_id;		

		} 
		
	/**	public  UserImp (String nom,String prenom, String pseudo, String mail, String motPasse, String numTele, String adresse, int role_id) {
			this.numTele=numTele;
			this.nom=nom;
			this.prenom=prenom;
			this.mail=mail;
			this.pseudo=pseudo;
			this.adresse=adresse;
			this.motPasse=motPasse;
			this.role_id=role_id;
		}*/
		
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
		
		public long getRole_id() {
			return role_id;
		}

		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		

		public long getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<AnnouncementImpl> getListeAnnonce() {
			return listeAnnonce;
		}

		public void setListeAnnonce(List<AnnouncementImpl> listeAnnonce) {
			this.listeAnnonce = listeAnnonce;
		}

		public List<AnnouncementImpl> getListeAnnonceF() {
			return listeAnnonceF;
		}

		public void setListeAnnonceF(List<AnnouncementImpl> listeAnnonceF) {
			this.listeAnnonceF = listeAnnonceF;
		}

}
