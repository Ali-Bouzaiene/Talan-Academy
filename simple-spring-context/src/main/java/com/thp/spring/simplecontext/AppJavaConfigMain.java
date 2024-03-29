package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfigMain {

	public static void main(String[] args) {	

		   
		        ApplicationContext vApplicationContext = new AnnotationConfigApplicationContext(AppMoussaillonConfig.class);

		        Moussaillon vMoussaillon = vApplicationContext.getBean("moussaillon", Moussaillon.class);
		        // ...
		        System.out.println("Le pr�nom du moussaillon : "+vMoussaillon.getFirstName());
		        System.out.println("Le nom du moussaillon : "+vMoussaillon.getLastName());
		        System.out.println("Configuration utilis�e : "+vMoussaillon.getConfig());
		        System.out.println("Bravo, vous venez de cr�er votre premier contexte Spring en Java !!");

	}

}
