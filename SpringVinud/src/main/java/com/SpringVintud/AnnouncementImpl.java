package com.SpringVintud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="announcement")
public class AnnouncementImpl {
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	@Column( name="title" )
		private String titre;
	@Column( name="description" )
		private String description;
	@Column( name="localisation" )
		private String localisation;
	@Column( name="price" )
		private double prix;
	@Column( name="user_id" )
		private int user_id;
	@Column( name="id" )
		private int id;
	@Column( name="view_number" )
		private int nbrVue;
	@Column( name="category_id" )
		private int catégorie;
	@Column( name="publication_date" )
		private String datePub;
	@Column( name="picture" )
		private String photo;
	@Column( name="is_available" )
		private boolean valide;
			public AnnouncementImpl(int id,String titre,String description,int catégorie,double prix,String photo,String datePub,boolean valide,int nbrVue,String localisation,int user_id) {
					this.id=id;
					this.user_id=user_id;					
					this.titre=titre;
					this.description=description;
					this.catégorie=catégorie;
					this.prix=prix;
					this.photo=photo;
					this.datePub=datePub;
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

			public int getCatégorie() {
				return catégorie;
			}

			public void setCatégorie(int catégorie) {
				this.catégorie = catégorie;
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

			public String getPhoto() {
				return photo;
			}

			public void setPhoto(String photo) {
				this.photo = photo;
			}

			public boolean isValide() {
				return valide;
			}

			public void setValide(boolean valide) {
				this.valide = valide;
			}			
			
}
