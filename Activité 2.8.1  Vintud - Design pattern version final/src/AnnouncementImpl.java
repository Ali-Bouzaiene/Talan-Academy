

import java.sql.Blob;
import java.sql.Date;

public class AnnouncementImpl {
		
		private String titre,description,localisation;
		private double prix;
		private int user_id,id,nbrVue,catégorie;
		private String datePub;
		private String photo;
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
