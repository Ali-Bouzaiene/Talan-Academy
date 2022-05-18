package com.octest.servlets;


public interface RechercheDAO {
		
	void creerRecherche (Recherche R);
	void supprimerRecherche (int id);
	void lancerRecherche (int id);
	void modifierRecherche (Recherche R);
	
}
