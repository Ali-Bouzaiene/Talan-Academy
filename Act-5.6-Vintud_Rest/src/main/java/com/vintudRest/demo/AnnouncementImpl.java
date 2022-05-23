package com.vintudRest.demo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "announcement")
public class AnnouncementImpl implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "category_id")
	private long category_id;
	@Column(name = "price")
	private double price;
	@Column(name = "picture")
	private String picture;
	@Column (name = "publication_date")
	private Date publication_date;
	@Column(name = "is_available")
	private boolean is_available;
	@Column(name = "view_number")
	private long view_number;
	@Column(name = "localisation")
	private String localisation;
	@Column(name = "user_id")
	private long user_id;
	
	public AnnouncementImpl(String title, String description, long category_id, double price, String picture,
			Date publication_date, boolean is_available, long view_number, String localisation, long user_id) {
		
		this.title = title;
		this.description = description;
		this.category_id = category_id;
		this.price = price;
		this.picture = picture;
		this.publication_date = publication_date;
		this.is_available = is_available;
		this.view_number = view_number;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public boolean isIs_available() {
		return is_available;
	}

	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}

	public long getView_number() {
		return view_number;
	}

	public void setView_number(long view_number) {
		this.view_number = view_number;
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
