
public class Main {

	public static void main(String[] args) {
        Livre l1 = new Livre("Le petit prince", "St Exupéry", 10.40f, 50);
        Livre l2 = new Livre("Contes", "Grimm", 14.40f, 254);
        l1.Afficher();
        l2.Afficher();

        BD b1 = new BD("Lucky Luke", "Morris", 10.40f, 45, true);
        BD b2 = new BD("Tintin", "Herge", 200.40f, 45, false);
        b1.Afficher();
        b2.Afficher();
        
        Manga m1 = new Manga("One piece", "Eiichiro Oda", 5.40f, 62);
        Manga m2 = new Manga("Death Note", "Tsugumi Oba", 7.40f, 75);
        m1.Afficher();
        m2.Afficher();
        
        Roman r1 = new Roman("Dora","Dora", 300, 3.5f) ;
        r1.setNbrCh(12);
        r1.setResume("Une description quelconque");
	}

}
