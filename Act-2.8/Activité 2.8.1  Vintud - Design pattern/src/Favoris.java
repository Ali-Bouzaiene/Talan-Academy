

public class Favoris {
	
	private int id,refAnnonce,refUtilisateur;
	private String dateFavoris;
	
		public Favoris(int id,int refAnnonce,int refUtilisateur,String dateFavoris) {
			this.refUtilisateur=refUtilisateur;
			this.refAnnonce=refAnnonce;
			this.dateFavoris=dateFavoris;
		}

		public Favoris() {
			
		}
			//getter_setter
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public int getRefAnnonce() {
			return refAnnonce;
		}
		public void setRefAnnonce(int refAnnonce) {
			this.refAnnonce = refAnnonce;
		}

		public int getRefUtilisateur() {
			return refUtilisateur;
		}

		public void setRefUtilisateur(int refUtilisateur) {
			this.refUtilisateur = refUtilisateur;
		}

		public String getDateFavoris() {
			return dateFavoris;
		}

		public void setDateFavoris(String dateFavoris) {
			this.dateFavoris = dateFavoris;
		}
			
			
}
