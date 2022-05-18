package com.octest.servlets;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RechercheDaoImpl extends DAO implements RechercheDAO {

	@Override
	public void creerRecherche(Recherche R) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO recherche (id_recherche,type,taille,couleur,fourchette_prix,ref_utilisateur) VALUES ("+R.getId()+",'"+R.getTypeHabit()+"','"+ R.getTaille() +"','"+R.getCouleur()+"','"+R.getFourchettePrix()+"','"+R.getRefUtilisateur()+"')");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

	@Override
	public void lancerRecherche(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * FROM recherche WHERE id_recherche="+id);
            while(res.next()) {
                System.out.println("Cette recherche est identifie par le type "+res.getString("type")+", "+res.getString("taille")+", "+res.getString("couleur")+", "+res.getString("fourchette_prix"));
                }
            
            con.close();
        } catch (SQLException e) {
			//traitement de l'exception
			}
		
	}

	@Override
	public void modifierRecherche(Recherche R) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery("UPDATE recherche SET type='"+R.getTypeHabit()+"',taille  ='"+R.getTaille()+"',couleur='"+R.getCouleur()+"',fourchette_prix='"+R.getFourchettePrix()+"' WHERE id_recherche ="+R.getId());
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}
		
	}
	@Override
	public void supprimerRecherche(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
			try {
	           	Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM recherche WHERE id_recherche ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

	
	
		
}
