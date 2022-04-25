import java.sql.Blob;
import java.sql.Date;

public class AnnouncementImpl {
		
		private String titre,description,cat�gorie,statut,�tat,localisation;
		private double prix;
		private int user_id,id,nbrVue;
		private Date datePub;
		private Blob photo;
		private boolean valide;
			public AnnouncementImpl(int user_id,int id,double prix,int nbrVue,Date datePub,Blob photo,String titre,String description,String cat�gorie,String statut,String �tat,String localisation,boolean valide) {
					this.user_id=user_id;
					this.id=id;
					this.titre=titre;
					this.description=description;
					this.cat�gorie=cat�gorie;
					this.prix=prix;
					this.photo=photo;
					this.datePub=datePub;
					this.statut=statut;
					this.�tat=�tat;
					this.nbrVue=nbrVue;
					this.localisation=localisation;
					this.valide=valide;
			}

			//getter_setter	

			public AnnouncementImpl(int user_id2, int id2, int prix2, int nbrVue2, String string, String string2,
					String titre2, String description2, String cat�gorie2, String statut2, Object �tat2,
					Object localisation2, boolean valide2) {
				// TODO Auto-generated constructor stub
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

			public String getCat�gorie() {
				return cat�gorie;
			}

			public void setCat�gorie(String cat�gorie) {
				this.cat�gorie = cat�gorie;
			}

			public String getStatut() {
				return statut;
			}

			public void setStatut(String statut) {
				this.statut = statut;
			}

			public String get�tat() {
				return �tat;
			}

			public void set�tat(String �tat) {
				this.�tat = �tat;
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

			public Date getDatePub() {
				return datePub;
			}

			public void setDatePub(Date datePub) {
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
