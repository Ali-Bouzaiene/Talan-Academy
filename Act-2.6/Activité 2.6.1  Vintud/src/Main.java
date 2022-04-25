
public class Main {

	public static void main(String[] args) {
		UserImp u1=new UserImp();			
			u1.setNom("bouzaiene");
			u1.setPrenom("ali");
			u1.setPseudo("alibz");
			u1.setMail("3alibz@gmail.com");			
			u1.setMotPasse("123456789");
			u1.setAdresse("tunis");
			u1.setNumTele("53250795");
			u1.setRole_id(5);
			u1.setId(1);
			
		AnnouncementManager annonce=new AnnouncementManager();		
		annonce.creerCompte(u1);
		annonce.connecter(u1);
		UserImp u2=new UserImp();
		u2.setNom("bouzaiene");
		u2.setPrenom("ali");		
		u2.setMail("3alibz@gmail.com");	
		u2.setId(1);
		annonce.modifierInfPersonnelle(u2);
		annonce.ConsulterInformationsVendeur(1);
		AnnouncementImpl annonce1=new AnnouncementImpl(1, 2, 3,10,"2019-02-25 11:32:12", null, "veste", "Je vends ma sublime veste", "zara", "bon", "nouveau", null, false);
		AnnouncementImpl annonce2=new AnnouncementImpl(1, 2, 3,10,"2019-02-25 11:32:12", null, "chemise", "Je vends ma sublime chemise", "exist", "bon", "nouveau", null, false);
		annonce.DeposerAnnonce(annonce1);
		annonce.ModifierAnnonce(annonce2);
		annonce.SupprimerAnnonce(1);
	}

}
