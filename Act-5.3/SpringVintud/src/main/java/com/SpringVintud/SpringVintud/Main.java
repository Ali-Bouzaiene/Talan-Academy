package com.SpringVintud.SpringVintud;

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
		ENTITY_MANAGER_FACTORY.close();
	}
		
		public static void addUser (String firstname,String name, String pseudo, String mail, String u_password , String phone, String address,int role_id) {
			EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
			EntityTransaction et = null;
			try {
				et = em.getTransaction();
				et.begin();
				UserImp cust = new UserImp("ali","ali", "ali","ali", "ali" , "ali", "ali",4, 4);
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
}
