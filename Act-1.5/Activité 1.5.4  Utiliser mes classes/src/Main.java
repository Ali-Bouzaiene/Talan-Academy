
public class Main {

	public static void main(String[] args) {
		Bateau monBateau = new Bateau("bois",2000);
		Coque coque=new Coque("trois","red");
		Cabine cabine=new Cabine("bois","double");
		Pont pont=new Pont("bois","Pont sup�rieur");
		Mat mat=new Mat("bon",3);
		Voile voile=new Voile("latine",3);
		System.out.println(monBateau);
		System.out.println(coque);
		System.out.println(cabine);
		System.out.println(pont + " " + "est consitut� du" + " " + mat + "qui est constitu� de" + " " + voile);

	}

}
