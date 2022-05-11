package com.thp.project.vintud.dao.controller;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnnonceDAOImpl extends DAO implements AnnonceDAO {

	@Override
	public void DeposerAnnonce(AnnouncementImpl annoce) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+annoce.getId()+",'"+annoce.getTitre()+"','"+ annoce.getDescription() +"','"+annoce.getCatégorie()+"','"+annoce.getPrix()+"','"+annoce.getPhoto()+"',DATE'"+annoce.getDatePub()+"',"+annoce.isValide()+","+0+",'"+annoce.getLocalisation()+"',"+annoce.getUser_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

	@Override
	public void ConsulterAnnonceDispo(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		
		try {
            Statement stmt = con.createStatement();
           
            ResultSet res = stmt.executeQuery("SELECT * FROM announcement WHERE id="+id);
            while(res.next()) {
                System.out.println("Cette annonce est identifiée par le nom "+res.getString("title"));
                }
            
            con.close();
        } catch (SQLException e) {
        }
		
	}

	@Override
	public void ModifierAnnonce(AnnouncementImpl annoce) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
		 	try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE announcement SET title ='"+annoce.getTitre()+"',description ='"+annoce.getDescription()+"',price ="+annoce.getPrix()+",picture ='"+annoce.getPhoto()+"',publication_date ='"+annoce.getDatePub()+"',is_available ="+annoce.isValide()+",view_number ="+0+",localisation ='"+annoce.getLocalisation()+"' WHERE id ="+annoce.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

	@Override
	public void SupprimerAnnonce(int id) {
		ConnectionManager connect=ConnectionManager.getInstance();
		Connection con = connect.getConnection();
			try {
	           	Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM announcement WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
		
	}

}
