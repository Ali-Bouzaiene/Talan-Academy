package com.Spring.vintudHb;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table (name="announcement")
public class AnnouncementImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="title")
	private String titre;
	@Column(name="description")
	private String description;
	@ManyToOne @JoinColumn( name="category_id" )
	private long catégorie;
	@Column(name="price")
	private double prix;
	@Column(name="picture")
	private String photo;
	@Column(name="publication_date")
	private Date datePub;
	@Column(name="is_available")
	private boolean valide;
	@Column(name="view_number")
	private long nbrVue;
	@Column(name="localisation")
	private String localisation;
	@ManyToOne @JoinColumn( name="user_id" )
	private long user_id;
	
	
	public AnnouncementImpl(String titre, String description, long catégorie, double prix, String photo,
			Date datePub, boolean valide, long nbrVue, String localisation, long user_id) {		
		
		this.titre = titre;
		this.description = description;
		this.catégorie = catégorie;
		this.prix = prix;
		this.photo = photo;
		this.datePub = datePub;
		this.valide = valide;
		this.nbrVue = nbrVue;
		this.localisation = localisation;
		this.user_id = user_id;
	}


	public AnnouncementImpl() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public long getCatégorie() {
		return catégorie;
	}


	public void setCatégorie(long catégorie) {
		this.catégorie = catégorie;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getDatePub() {
		return datePub;
	}


	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}


	public boolean isValide() {
		return valide;
	}


	public void setValide(boolean valide) {
		this.valide = valide;
	}


	public long getNbrVue() {
		return nbrVue;
	}


	public void setNbrVue(long nbrVue) {
		this.nbrVue = nbrVue;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
}
