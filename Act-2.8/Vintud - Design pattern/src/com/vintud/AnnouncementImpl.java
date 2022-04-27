package com.vintud;

import java.sql.Blob;
import java.sql.Date;

public class AnnouncementImpl {
		
		private String titre,description,catégorie,statut,état,localisation;
		private double prix;
		private int user_id,id,nbrVue;
		private String datePub;
		private Blob photo;
		private boolean valide;
			public AnnouncementImpl(int user_id,int id,double prix,int nbrVue,String datePub,Blob photo,String titre,String description,String catégorie,String statut,String état,String localisation,boolean valide) {
					this.user_id=user_id;
					this.id=id;
					this.titre=titre;
					this.description=description;
					this.catégorie=catégorie;
					this.prix=prix;
					this.photo=photo;
					this.datePub=datePub;
					this.statut=statut;
					this.état=état;
					this.nbrVue=nbrVue;
					this.localisation=localisation;
					this.valide=valide;
			}

			//getter_setter	

			public AnnouncementImpl() {
				
			}

			public int getUser_id() {
				return user_id;
			}

			public void setUser_id(int user_id) {
				this.user_id = user_id;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getTitre() {
				return titre;
			}

			public void setTitre(String titre) {
				this.titre = titre;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCatégorie() {
				return catégorie;
			}

			public void setCatégorie(String catégorie) {
				this.catégorie = catégorie;
			}

			public String getStatut() {
				return statut;
			}

			public void setStatut(String statut) {
				this.statut = statut;
			}

			public String getÉtat() {
				return état;
			}

			public void setÉtat(String état) {
				this.état = état;
			}

			public String getLocalisation() {
				return localisation;
			}

			public void setLocalisation(String localisation) {
				this.localisation = localisation;
			}

			public double getPrix() {
				return prix;
			}

			public void setPrix(double prix) {
				this.prix = prix;
			}

			public int getNbrVue() {
				return nbrVue;
			}

			public void setNbrVue(int nbrVue) {
				this.nbrVue = nbrVue;
			}

			public String getDatePub() {
				return datePub;
			}

			public void setDatePub(String datePub) {
				this.datePub = datePub;
			}

			public Blob getPhoto() {
				return photo;
			}

			public void setPhoto(Blob photo) {
				this.photo = photo;
			}

			public boolean isValide() {
				return valide;
			}

			public void setValide(boolean valide) {
				this.valide = valide;
			}
			
			
}
