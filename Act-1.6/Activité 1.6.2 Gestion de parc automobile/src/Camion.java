
public class Camion extends Vehicule {

	public Camion (int numM,int modele,double prix,int P ) {
		super(numM,modele,prix,P);
	}
	public void demarrer() {
		System.out.println("Un camion  de" + " " + modele + " " + "matricule" + " " + "démarre");
	}
	public void accelerer() {
		System.out.println("Un camion  de" + " " + modele + " " + "matricule" + " " + "accélère");
	}
	public String toString() {		
		return "Un camion de" + " " + modele +" "+ "matricule" +" "+ numM +" "+ "d'une puissance de" +" "+ P +" "+ "cv" +" "+ "et au prix de" +" "+ prix +" "+ "euros a été enregistrée.";
	}
}
