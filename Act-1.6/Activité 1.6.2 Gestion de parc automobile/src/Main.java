
public class Main {

	public static void main(String[] args) {
		Voiture v=new Voiture(1,2017, 7.800,5);
		System.out.println(v);
		v.demarrer();
		v.accelerer();
		Camion c = new Camion(2, 2015, 15.200, 7);
		System.out.println(c);
	    c.demarrer();
	    c.accelerer();
	}

}
