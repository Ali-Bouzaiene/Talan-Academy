package com.octest.servlets;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AnnonceDAOImpl extends DAO implements AnnonceDAO {

	@Override
	public void DeposerAnnonce(AnnouncementImpl annoce) {
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "insert into announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, annoce.getId());
			ps.setString(2, annoce.getTitre());
			ps.setString(3,annoce.getDescription());
			ps.setInt(4,annoce.getCatégorie());
			ps.setDouble(5,annoce.getPrix());
			ps.setString(6,annoce.getPhoto());
			ps.setString(7,annoce.getDatePub());
			ps.setBoolean(8,annoce.isValide());	
			ps.setInt(9,annoce.getNbrVue());
			ps.setString(10,annoce.getLocalisation());
			ps.setInt(11,annoce.getUser_id());
			
			
			if (ps.executeUpdate() == 1) {
				System.out.println("annonce has been added ");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();

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
		try {	
			ConnectionManager C= ConnectionManager.getInstance();

			Connection con = C.getConnection();
		
			String req = "UPDATE announcement SET title = ?, description = ?, category_id = ?, price = ?, picture = ?, publication_date = ?, is_available = ?, view_number = ?,localisation =? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1, annoce.getTitre());
			ps.setString(2, annoce.getDescription());
			ps.setInt(3,annoce.getCatégorie());
			ps.setDouble(4,annoce.getPrix());
			ps.setString(5,annoce.getPhoto());
			ps.setString(6,annoce.getDatePub());
			ps.setBoolean(7,annoce.isValide());
			ps.setInt(8,annoce.getNbrVue());
			ps.setString(9,annoce.getLocalisation());
			ps.setInt(10,annoce.getId());
			ps.executeUpdate();
			System.out.println("modification terminer");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				e.printStackTrace();
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
	        	System.out.println("annonce supprimer"); 
	        }
		
	}

}
