package com.vintud;

public interface FavorisDAO {
	void creerFavoris(Favoris F);
	void modifierFavoris(Favoris F);
	void retrouverAnnonceFavoris(Favoris F);	
	void supprimerFavoris(int id);
}
