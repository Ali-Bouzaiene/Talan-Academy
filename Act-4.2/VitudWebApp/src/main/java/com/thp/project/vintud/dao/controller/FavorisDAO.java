package com.thp.project.vintud.dao.controller;



public interface FavorisDAO {
	void creerFavoris(Favoris F);
	void modifierFavoris(Favoris F);
	void retrouverAnnonceFavoris();	
	void supprimerFavoris(int id);
}
