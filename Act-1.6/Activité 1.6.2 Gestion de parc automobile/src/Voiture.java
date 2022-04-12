
public class Voiture extends Vehicule {

	public Voiture (int numM,int modele,double prix,int P ) {
		super(numM,modele,prix,P);
	}
	public void demarrer() {
		System.out.println("Une voiture de" + " " + modele + " " + "matricule" + " " + "démarre");
	}
	public void accelerer() {
		System.out.println("Une voiture de" + " " + modele + " " + "matricule" + " " + "accélère");
	}
	public String toString() {		
		return "Une voiture de" + " " + modele +" "+ "matricule" +" "+ numM +" "+ "d'une puissance de" +" "+ P +" "+ "cv" +" "+ "et au prix de" +" "+ prix +" "+ "euros a été enregistrée.";
	}
}
