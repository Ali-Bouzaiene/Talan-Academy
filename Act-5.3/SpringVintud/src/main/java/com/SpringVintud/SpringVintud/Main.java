package com.SpringVintud.SpringVintud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
            entityManager = entityManagerFactory.createEntityManager();
        
            System.out.println( "- Lecture de tous les users -----------" );
            
            List<UserImp> user = entityManager.createQuery( "from Article", UserImp.class ).getResultList();
            for (UserImp users : user) {
                System.out.println( users );
            }
	}finally {
        if ( entityManager != null ) entityManager.close();
        if ( entityManagerFactory != null ) entityManagerFactory.close();
    }

}
}
