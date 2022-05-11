package com.thp.project.vintud.dao.controller;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UtilisateurDAOImpl extends DAO implements UtilisateurDAO {

	@Override
	public void creerCompte(UserImp u) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con= connect.getConnection();
		try {
		Statement stmt = con.createStatement();

		ResultSet res = stmt.executeQuery("INSERT INTO users(id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES("+u.getId()+",'"+u.getNom()+"','"+u.getPrenom()+"','"+u.getPseudo()+"','"+u.getMail()+"','"+u.getMotPasse()+"','"+u.getNumTele()+"','"+u.getAdresse()+"',"+u.getRole_id()+")");
		
		con.close();
		} catch (SQLException e) {
		//traitement de l'exception
		}			
		
	}

	@Override
	public boolean (String email,String passe) {
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
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("UPDATE users SET first_name='"+u.getNom()+"',last_name ='"+u.getPrenom()+"',mail='"+u.getMail()+"' ");
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
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

	            	System.out.println(res.getString("first_name") +res.getString("last_name")+res.getString("mail"));
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

			
}
