package com.vintud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FavorisDaoImpl implements FavorisDAO {

	@Override
	public void creerFavoris(Favoris F) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO favoris (id_favoris,ref_id_annonce,ref_id_users,date_favoris) VALUES ("+F.getId()+",'"+F.getRefAnnonce()+"','"+ F.getRefUtilisateur() +"','"+F.getDateFavoris()+"')");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

	@Override
	public void modifierFavoris(Favoris F) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery("UPDATE favoris SET ref_id_annonce="+F.getRefAnnonce()+",ref_id_users ="+F.getRefUtilisateur()+",date_favoris='"+F.getDateFavoris()+"' WHERE id_favoris ="+F.getId());
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}
		
	}

	@Override
	public void retrouverAnnonceFavoris(Favoris F) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter un id de favoris");
		int idFavoris = input.nextInt();		
	
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("SELECT id FROM announcement WHERE id='"+idFavoris+"' ");
			 if (res.next()) {
				 System.out.print("l'annonce est :");
			 }else {
				 System.out.print("error Mail and Mot de passe");
			 }
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}	
		
	}

	@Override
	public void supprimerFavoris(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
			try {
	           	Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM favoris WHERE id_favoris ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

}
