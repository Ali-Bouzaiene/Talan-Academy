package com.octest.servlets;



public class Main {

	public static void main(String[] args) {
	/**	UserImp u1=new UserImp();			
			u1.setNom("bouzaiene");
			u1.setPrenom("ali");
			u1.setPseudo("alibz");
			u1.setMail("3alibz@gmail.com");			
			u1.setMotPasse("123456789");
			u1.setAdresse("tunis");
			u1.setNumTele("53250795");
			u1.setRole_id(5);
			u1.setId(1);
			
			UtilisateurDAOImpl u=new UtilisateurDAOImpl();	
			AnnonceDAOImpl a=new AnnonceDAOImpl();
		u.creerCompte(u1);
		u.connecter(u1);
		UserImp u2=new UserImp();
		u2.setNom("bouzaiene");
		u2.setPrenom("ali");		
		u2.setMail("3alibz@gmail.com");	
		u2.setId(1);
		u.modifierInfPersonnelle(u2);
		u.ConsulterInformationsVendeur(1);
		AnnouncementImpl a1=new AnnouncementImpl();
		AnnouncementImpl a2=new AnnouncementImpl();
		a1.setId(2);
		a1.setNbrVue(10);
		a1.setUser_id(1);
		a1.setPrix(14.5);
		a1.setTitre("Veste");
		a1.setDescription("Je vends mon magnifique veste zara acheté l''année dernière en solde");
		a1.setCatégorie("taille M");
		a1.setPhoto(null);
		a1.setDatePub("2019-02-25 11:32:12");
		a1.setValide(true);
		a1.setLocalisation(null);
		a.DeposerAnnonce(a1);
		a2.setId(2);
		a2.setNbrVue(8);
		a2.setUser_id(1);
		a2.setPrix(11.5);
		a2.setTitre("chemise");
		a2.setDescription("Je vends mon magnifique chemise exist acheté l''année dernière en solde");
		a2.setCatégorie("taille M");
		a.ModifierAnnonce(a2);
		a.SupprimerAnnonce(2);*/
		
	/**	//favoris
		FavorisDaoImpl f=new FavorisDaoImpl();
		
		Favoris f1=new Favoris();
		f1.setId(1);
		f1.setRefAnnonce(1);
		f1.setRefUtilisateur(1);
		f1.setDateFavoris("2021-04-25 11:32:12");
		f.creerFavoris(f1);
		Favoris f2=new Favoris();
		f2.setId(2);
		f2.setRefAnnonce(2);
		f2.setRefUtilisateur(3);
		f2.setDateFavoris("2020-01-25 11:32:12");
		f.creerFavoris(f2);
		Favoris f3=new Favoris();
		f3.setId(3);
		f3.setRefAnnonce(2);
		f3.setRefUtilisateur(1);
		f3.setDateFavoris("2021-01-25 11:32:12");
		f.creerFavoris(f3);
		Favoris f4=new Favoris();
		f4.setId(1);
		f4.setRefAnnonce(1);
		f4.setRefUtilisateur(3);
		f4.setDateFavoris("2040-01-05 11:32:12");		
		f.modifierFavoris(f4);
		f.supprimerFavoris(2);
		f.retrouverAnnonceFavoris();
		//recherche
		RechercheDaoImpl R=new RechercheDaoImpl();
		
		Recherche R1=new Recherche();
		Recherche R2=new Recherche();
		Recherche R3=new Recherche();
		R1.setId(1);
		R1.setTypeHabit("Robe");
		R1.setTaille("S");				
		R1.setCouleur("rouge");
		R1.setFourchettePrix(40.5);
		R1.setRefUtilisateur(1);
		R2.setId(2);
		R2.setTypeHabit("T-Shirt");
		R2.setTaille("M");				
		R2.setCouleur("noir");
		R2.setFourchettePrix(20.5);
		R2.setRefUtilisateur(2);
		R3.setId(3);
		R3.setTypeHabit("Chemise");
		R3.setTaille("M");				
		R3.setCouleur("gris");
		R3.setFourchettePrix(30);
		R3.setRefUtilisateur(3);
		R.creerRecherche(R1);
		R.creerRecherche(R2);
		R.creerRecherche(R3);
		
		Recherche r=new Recherche();
		r.setId(2);
		r.setTypeHabit("Maillot");
		r.setTaille("M");				
		r.setCouleur("Bleu");
		r.setFourchettePrix(10);
		R.modifierRecherche(r);
		
		R.lancerRecherche(1); */
		
	}
	

}
