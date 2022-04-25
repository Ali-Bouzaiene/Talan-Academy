import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class AnnouncementManager {
	void creerCompte(UserImp u) {		
		Connection con = ConnectionManager.getConnection();

		try {
		Statement stmt = con.createStatement();

		ResultSet res = stmt.executeQuery("INSERT INTO users(id,first_name,last_name,pseudo,mail,u_password,phone,address,role_id) VALUES("+u.getId()+",'"+u.getNom()+"','"+u.getPrenom()+"','"+u.getPseudo()+"','"+u.getMail()+"','"+u.getMotPasse()+"','"+u.getNumTele()+"','"+u.getAdresse()+"',"+u.getRole_id()+")");
		
		con.close();
		} catch (SQLException e) {
		//traitement de l'exception
		}			
		
	}
	
	void connecter (UserImp u) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter un mail");
		String email = input.nextLine();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter un mot de passe");
		String passe = input1.nextLine();
		Connection con = ConnectionManager.getConnection();
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("SELECT mail FROM users WHERE mail='"+email+"' AND u_password= '"+passe+"' ");
			 if (res.next()) {
				 System.out.print("welcome to the profil");
			 }else {
				 System.out.print("error Mail and Mot de passe");
			 }
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}			
	}
	void modifierInfPersonnelle (UserImp u) {
		Connection con = ConnectionManager.getConnection();
		try {
			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("UPDATE users SET first_name='"+u.getNom()+"',last_name ='"+u.getPrenom()+"',mail='"+u.getMail()+"' ");
			con.close();
			} catch (SQLException e) {
			//traitement de l'exception
			}
	}
	void ConsulterAnnonceDispo () {
		
	}
	void ConsulterInformationsVendeur (int id) {
		Connection con = ConnectionManager.getConnection();
			try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("SELECT  * FROM users WHERE id ="+id);
	            while(res.next()) {
	            	String first_name = res.getString("first_name");
	            	String last_name = res.getString("last_name");
	            	String pseudo = res.getString("pseudo");
	            	String mail = res.getString("mail");
	            	String phone = res.getString("phone");
	            	String address = res.getString("address");
	                System.out.println("Prénom: "+ first_name+"; \nNom: "+last_name+"; \nPseudo: "+pseudo+"; \nEmail: "+mail+"; \nPhone: "+phone+"; \nAdresse: "+address+"\n\n");
	               
	            }
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void DeposerAnnonce (AnnouncementImpl annoce) {
		Connection con = ConnectionManager.getConnection();
		try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("INSERT INTO announcement (id,title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES ("+annoce.getId()+",'"+annoce.getTitre()+"','"+ annoce.getDescription() +"','"+annoce.getCatégorie()+"','"+annoce.getPrix()+"','"+annoce.getPhoto()+"',DATE'"+annoce.getDatePub()+"',"+annoce.isValide()+","+0+",'"+annoce.getLocalisation()+"',"+annoce.getUser_id()+")");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void SupprimerAnnonce (int id) {
		 Connection con = ConnectionManager.getConnection();
			try {
	           	Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("DELETE FROM announcement WHERE id ="+id);
	            con.close();
	        } catch (SQLException e) {
	        }
	}
	void ModifierAnnonce (AnnouncementImpl annoce) {
		Connection con = ConnectionManager.getConnection();
		 	try {	            
	            Statement stmt = con.createStatement();
	            ResultSet res = stmt.executeQuery("UPDATE announcement SET title ='"+annoce.getTitre()+"',description ='"+annoce.getDescription()+"',price ="+annoce.getPrix()+",picture ='"+annoce.getPhoto()+"',publication_date ='"+annoce.getDatePub()+"',is_available ="+annoce.isValide()+",view_number ="+0+",localisation ='"+annoce.getLocalisation()+"' WHERE id ="+annoce.getId()+";");
	           
	            
	            con.close();
	        } catch (SQLException e) {
	        }
	}

}
