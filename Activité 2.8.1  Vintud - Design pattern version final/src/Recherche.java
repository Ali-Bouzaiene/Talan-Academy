

public class Recherche {
	
		private String typeHabit,taille,couleur;
		private double fourchettePrix;
		private int id,refUtilisateur;
		public Recherche(String typeHabit, String taille, String couleur, double fourchettePrix,int id, int refUtilisateur) {
			
			this.typeHabit = typeHabit;
			this.taille = taille;
			this.couleur = couleur;
			this.fourchettePrix = fourchettePrix;
			this.refUtilisateur = refUtilisateur;
			this.id=id;
		}
		public Recherche() {
			
		}
		
		//getter_setter
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTypeHabit() {
			return typeHabit;
		}

		public void setTypeHabit(String typeHabit) {
			this.typeHabit = typeHabit;
		}
		public String getTaille() {
			return taille;
		}
		public void setTaille(String taille) {
			this.taille = taille;
		}
		public String getCouleur() {
			return couleur;
		}
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		public double getFourchettePrix() {
			return fourchettePrix;
		}
		public void setFourchettePrix(double fourchettePrix) {
			this.fourchettePrix = fourchettePrix;
		}
		public int getRefUtilisateur() {
			return refUtilisateur;
		}
		public void setRefUtilisateur(int refUtilisateur) {
			this.refUtilisateur = refUtilisateur;
		}
		
		
}
