package com.octest.servlets;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FavorisDaoImpl extends DAO implements FavorisDAO {

	@Override
	public void creerFavoris(Favoris F) {
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "insert into favoris (id_favoris,ref_id_annonce,ref_id_users,date_favoris) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, F.getId());
			ps.setInt(2, F.getRefAnnonce());
			ps.setInt(3,F.getRefUtilisateur());
			ps.setString(4,F.getDateFavoris());			
			
			if (ps.executeUpdate() == 1) {
				System.out.println("Favoris has been added ");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();

			}
		
	}

	@Override
	public void modifierFavoris(Favoris F) {
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "UPDATE favoris SET ref_id_annonce = ?, ref_id_users = ?, date_favoris = ? WHERE id_favoris = ?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, F.getRefAnnonce());
			ps.setInt(2, F.getRefUtilisateur());
			ps.setString(3,F.getDateFavoris());
			ps.setInt(4,F.getId());

			ps.executeUpdate();
			System.out.println("modification terminer");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();
			}
		
	}

	@Override
	public void retrouverAnnonceFavoris(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();	
	
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("SELECT  * FROM favoris WHERE id_favoris="+id);
			 if (res.next()) {
				 System.out.print("l'annonce est : "+"reference annonce"+res.getString("ref_id_annonce")+" "+"date de l'annonce"+res.getString("date_favoris"));
			 }else {
				 System.out.print("pas d'annonce favoris");
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
	        	System.out.print("favoris supprimer");
	        }
		
	}



}
