package com.SpringVintud.SpringVintud;

public interface FavorisDAO {
	void creerFavoris(Favoris F);
	void modifierFavoris(Favoris F);
	void retrouverAnnonceFavoris(int id);	
	void supprimerFavoris(int id);	
}
