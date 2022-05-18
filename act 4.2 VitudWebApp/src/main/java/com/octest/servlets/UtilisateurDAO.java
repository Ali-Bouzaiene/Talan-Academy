package com.octest.servlets;


public interface UtilisateurDAO {
	void creerCompte(UserImp userImp);
	boolean connecter (String email,String passe);
	void modifierInfPersonnelle (UserImp userImp);
	void ConsulterInformationsVendeur (int id);
}
