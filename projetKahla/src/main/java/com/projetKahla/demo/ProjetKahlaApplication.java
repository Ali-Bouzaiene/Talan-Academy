package com.projetKahla.demo;







import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projetKahla.demo.Entity.Role;
import com.projetKahla.demo.Entity.User;
import com.projetKahla.demo.Service.UserService;

@SpringBootApplication
public class ProjetKahlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetKahlaApplication.class, args);
	}
	@Bean
	CommandLineRunner run(UserService userService) {
		return args ->{
			userService.saveRole(new Role("ROLE_USER"));	
			userService.saveRole(new Role("ROLE_MANAGER"));
			userService.saveRole(new Role("ROLE_ADMIN"));
			userService.saveRole(new Role("ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User("John Travolta", "john", "1234", new ArrayList<Role>()));
			userService.saveUser(new User("Will Smith", "will", "1234", new ArrayList<Role>()));
			userService.saveUser(new User("Jim Carry", "jim", "1234", new ArrayList<Role>()));
			userService.saveUser(new User("Arnold Schwarzenegger", "arnold", "1234", new ArrayList<Role>()));
			
			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("john", "ROLE_MANAGER");
			userService.addRoleToUser("will", "ROLE_MANAGER");
			userService.addRoleToUser("jim", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_USER");
		};
		
	}
}
