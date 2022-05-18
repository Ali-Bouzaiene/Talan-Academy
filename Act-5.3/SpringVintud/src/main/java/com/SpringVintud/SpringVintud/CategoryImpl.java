package com.SpringVintud.SpringVintud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="category")
public class CategoryImpl {
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	@Column( name="name" )
		private String nom;
	@Column( name="description" )
		private String description;
		
		public CategoryImpl(String nom,String description) {
				this.nom=nom;
				this.description=description;
		}
		
			public CategoryImpl () {
				
			}

			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}			
			
}
