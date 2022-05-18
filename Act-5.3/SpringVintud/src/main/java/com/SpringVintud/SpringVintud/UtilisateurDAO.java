package com.SpringVintud.SpringVintud;



public interface UtilisateurDAO {
	void creerCompte(UserImp userImp);
	void connecter (UserImp u);
	void modifierInfPersonnelle (UserImp userImp);
	void ConsulterInformationsVendeur (int id);
}
