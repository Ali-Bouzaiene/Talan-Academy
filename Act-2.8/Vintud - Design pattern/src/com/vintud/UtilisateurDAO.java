package com.vintud;

public interface UtilisateurDAO {
	void creerCompte(UserImp userImp);
	void connecter (UserImp userImp);
	void modifierInfPersonnelle (UserImp userImp);
	void ConsulterInformationsVendeur (int id);
}
