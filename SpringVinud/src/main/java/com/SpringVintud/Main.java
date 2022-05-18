package com.SpringVintud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class Main {
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Vintud");
	public static void main(String[] args) {
		addUser("Moudir1954546","Moudir", "Moudir", "Moudir", "Moudir", "Moudir", "Moudir", 1);
	}
		
		public static void addUser (String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id) {
			EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
			EntityTransaction et = null;
			try {
				et = em.getTransaction();
				et.begin();
				UserImp cust = new UserImp(nom, prenom, pseudo, mail, motPasse, numTele, adresse, role_id, role_id);
				em.persist(cust);
				et.commit();
				} catch (Exception ex) {
					// If there is an exception rollback changes
					if (et != null) {
					et.rollback();
					}
					ex.printStackTrace();
					} finally {
					// Close EntityManager
					em.close();
				}
	}
		 public static void getUser(long id) {
		    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		    	
		    	// the lowercase c refers to the object
		    	// :custID is a parameterized query thats value is set below
		    	String query = "SELECT c FROM UserImpl c WHERE c.id = :id";
		    	
		    	// Issue the query and get a matching Customer
		    	TypedQuery<UserImpl> tq = em.createQuery(query, UserImpl.class);
		    	tq.setParameter("id", id);
		    	
		    	UserImpl cust = null;
		    	try {
		    		// Get matching customer object and output
		    		cust = tq.getSingleResult();
		    		System.out.println(cust.getFirstname() + "\n" + cust.getName() + "\n " +cust.getPseudo() + "\n " +cust.getAddress() + " ");
		    	}
		    	catch(NoResultException ex) {
		    		ex.printStackTrace();
		    	}
		    	finally {
		    		em.close();
		    	}
		    }
		  public static void updateUser (long id,String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id) {
		        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		        EntityTransaction et = null;
		        
		    	UserImpl cust = null;
		 
		        try {
		            // Get transaction and start
		            et = em.getTransaction();
		            et.begin();
		 
		            // Find customer and make changes
		            cust = em.find(UserImpl.class, id);
		            cust.setFirstname(firstname);
		            cust.setName(name);
		            cust.setPseudo(pseudo);
		            cust.setMail(mail);
		            cust.setU_password(u_password);
		            cust.setPhone(phone);
		            cust.setAddress(address);
		            cust.setRole_id(role_id);
		 
		            // Save the customer object
		            em.persist(cust);
		            et.commit();
		        } catch (Exception ex) {
		            // If there is an exception rollback changes
		            if (et != null) {
		                et.rollback();
		            }
		            ex.printStackTrace();
		        } finally {
		            // Close EntityManager
		            em.close();
		        }
		    }
		    
		    public static void deleteUser(long id) {
		    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		        EntityTransaction et = null;
		        UserImpl cust = null;
		 
		        try {
		            et = em.getTransaction();
		            et.begin();
		            cust = em.find(UserImpl.class, id);
		            em.remove(cust);
		            et.commit();
		        } catch (Exception ex) {
		            // If there is an exception rollback changes
		            if (et != null) {
		                et.rollback();
		            }
		            ex.printStackTrace();
		        } finally {
		            // Close EntityManager
		            em.close();
		        }
		    }
}
