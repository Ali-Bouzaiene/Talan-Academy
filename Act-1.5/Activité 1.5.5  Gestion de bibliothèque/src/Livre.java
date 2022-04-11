
public class Livre {
	public String titre;
	public String auteur;
	public float prix;
	public int NbrP;
	
   public Livre(String titre, String auteur , float prix, int NbrP) {
	   this.titre=titre;
	   this.auteur=auteur;
	   this.prix=prix;
	   this.NbrP=NbrP;	   
   }
   public void Afficher() {
       System.out.println("Titre: " + this.titre);
       System.out.println("Auteur: " + this.auteur);
       System.out.println("Prix: " + this.prix + " TND");
       System.out.println("Nombre de pages: " + this.NbrP);
       
   }
}
