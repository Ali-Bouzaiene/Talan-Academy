package com.octest.servlets;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UtilisateurDAOImpl extends DAO implements UtilisateurDAO {

	@Override
	public void creerCompte(UserImp u) {
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "insert into users (first_name, last_name,pseudo,mail,u_password,phone,address,role_id) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3,u.getPseudo());
			ps.setString(4,u.getMail());
			ps.setString(5,u.getMotPasse());
			ps.setString(6,u.getNumTele());
			ps.setString(7,u.getAdresse());
			ps.setInt(8,u.getRole_id());		
			
			
			if (ps.executeUpdate() == 1) {
				System.out.println("user has been added successfully ");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();

			}				
		
	}

	@Override
	public boolean connecter(String email,String passe) {
		Boolean K=false;
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("SELECT mail FROM users WHERE mail='"+email+"' AND u_password= '"+passe+"' ");
			 if (res.next()) {
				 System.out.print("welcome to the profil");
				 K=true;
			 }else {
				 System.out.print("error Mail and Mot de passe");
				 K=false;
			 }
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}		
		return K;			
	}

	@Override
	public void modifierInfPersonnelle(UserImp u) {
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "UPDATE users SET first_name = ?, last_name = ?, pseudo = ?, mail = ?, u_password = ?, phone = ?, address = ?, role_id = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3,u.getPseudo());
			ps.setString(4,u.getMail());
			ps.setString(5,u.getMotPasse());
			ps.setString(6,u.getNumTele());
			ps.setString(7,u.getAdresse());
			ps.setInt(8,u.getRole_id());
			ps.setInt(9,u.getId());
			ps.executeUpdate();
			System.out.println("modification terminer");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();
			}
		
	}

	@Override
	public void ConsulterInformationsVendeur(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
			try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM users WHERE id ="+id);
	            while(res.next()) {

	            	System.out.println(res.getString("first_name")+res.getString("last_name")+res.getString("mail"));
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

			
}
