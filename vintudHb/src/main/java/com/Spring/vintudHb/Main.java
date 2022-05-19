package com.Spring.vintudHb;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class Main {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Vintud");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**	addUser("morad", "mom", "mouuu","mom@gmail.com", "7888889955","25047896", "mahdia", 1); */
	/**	getUsers(); */
	/**	getUser(84); */
	/**	updateUser(1, "oussama", "kkkkk", "ouss", "oussama@gmail.com", "1254789", "35698745", "kef"); */
	/**	deleteUser(83); */
		String str="2022-05-31";
		Date date=Date.valueOf(str);//converting string into sql dat
	/**	addAnnonce("veste", "fff", 3,20.5, "ffffffff",date, true, 72, "fffff", 3); */
		
		getAnnonces(); 
	/**	getAnnonce(3); */
	/**	updateAnnonce(3, "polo", "hhhhhhh", 1, 15.8, "mmmmm",date, true, 15, "kkkkk", 3); */
	/**	deleteAnnonce(3); */

	}
	  public static void addUser(String firstName, String lastName, String pseudo, String mail, String password,
				String phone, String adress, int roleId) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            UserImpl cust = new UserImpl(firstName, lastName,  pseudo, mail, password,phone, adress, roleId);	         
	 
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
	  	
	  public static void getUsers() {
		  EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		  String strQuery = "SELECT c FROM UserImpl c WHERE c.id IS NOT NULL";
		  TypedQuery<UserImpl> tq = em.createQuery(strQuery, UserImpl.class);
		  List<UserImpl> custs;
		  try {
	    		// Get matching customer object and output
			  custs = tq.getResultList();
			  custs.forEach(cust->System.out.println(cust.getFirstName()+""+cust.getLastName()+""+ cust.getPseudo()+""+cust.getMail()+""+cust.getPassword()+""+cust.getPhone()+""+cust.getAdress()));
	    	}catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	  }
	  public static void getUser(long id) {
		  EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		  String strQuery = "SELECT c FROM UserImpl c WHERE c.id = :ID";
		  TypedQuery<UserImpl> tq = em.createQuery(strQuery, UserImpl.class);
		  tq.setParameter("ID", id);
		  UserImpl cust = null;
		  try {
	    		// Get matching customer object and output
			  cust = tq.getSingleResult();
			  System.out.println(cust.getFirstName()+""+cust.getLastName()+""+ cust.getPseudo()+""+cust.getMail()+""+cust.getPassword()+""+cust.getPhone()+""+cust.getAdress());
	    	}catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	  }
	  public static void updateUser(long id, String firstName, String lastName, String pseudo, String mail,String password,String phone, String adress) {
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        
	        UserImpl cust = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Find customer and make changes
	            cust = em.find(UserImpl.class, id);
	            cust.setFirstName(firstName);
	            cust.setLastName(lastName);
	            cust.setPseudo(pseudo);
	            cust.setMail(mail);
	            cust.setPassword(password);
	            cust.setPhone(phone);
	            cust.setAdress(adress);
	 
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
	  public static void addAnnonce(String titre, String description, long catégorie, double prix, String photo,
				Date datePub, boolean valide, long nbrVue, String localisation, long user_id) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            AnnouncementImpl cust = new AnnouncementImpl(titre,description,catégorie,prix,photo,
	        			datePub,valide,nbrVue,localisation,user_id);	         
	 
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
	  public static void getAnnonces() {
		  EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		  String strQuery = "SELECT c FROM AnnouncementImpl c WHERE c.id IS NOT NULL";
		  TypedQuery<AnnouncementImpl> tq = em.createQuery(strQuery, AnnouncementImpl.class);
		  List<AnnouncementImpl> custs;
		  try {
	    		// Get matching customer object and output
			  custs = tq.getResultList();
			  custs.forEach(cust->System.out.println(cust.getTitre()+""+cust.getDescription()+""+ cust.getCatégorie()+""+cust.getPrix()+""+cust.getPhoto()+""+cust.getDatePub()+""+cust.isValide()+""+cust.getNbrVue()+""+cust.getLocalisation()+""+cust.getUser_id()));
	    	}catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	  }
	  public static void getAnnonce(long id) {
		  EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		  String strQuery = "SELECT c FROM AnnouncementImpl c WHERE c.id = :ID";
		  TypedQuery<AnnouncementImpl> tq = em.createQuery(strQuery, AnnouncementImpl.class);
		  tq.setParameter("ID", id);
		  AnnouncementImpl cust = null;
		  try {
	    		// Get matching customer object and output
			  cust = tq.getSingleResult();
			  System.out.println(cust.getTitre()+" "+cust.getDescription()+" "+ cust.getCatégorie()+" "+cust.getPrix()+" "+cust.getPhoto()+" "+cust.getDatePub()+" "+cust.isValide()+" "+cust.getNbrVue()+" "+cust.getLocalisation()+" "+cust.getUser_id());
	    	}catch(NoResultException ex) {
	    		ex.printStackTrace();
	    	}
	    	finally {
	    		em.close();
	    	}
	  }
	  public static void updateAnnonce(long id,String titre, String description, long catégorie, double prix, String photo,
				Date datePub, boolean valide, long nbrVue, String localisation, long user_id) {
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        
	        AnnouncementImpl cust = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Find customer and make changes
	            cust = em.find(AnnouncementImpl.class, id);
	            cust.setTitre(titre);
	            cust.setDescription(description);
	            cust.setCatégorie(catégorie);
	            cust.setPrix(prix);
	            cust.setPhoto(photo);
	            cust.setDatePub(datePub);
	            cust.setValide(valide);
	            cust.setNbrVue(nbrVue);
	            cust.setLocalisation(localisation);
	            cust.setUser_id(user_id);
	 
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
	  public static void deleteAnnonce(long id) {
	    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        AnnouncementImpl cust = null;
	 
	        try {
	            et = em.getTransaction();
	            et.begin();
	            cust = em.find(AnnouncementImpl.class, id);
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
