package com.projetAngular.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projetAngular.demo.Entity.Employee;
import com.projetAngular.demo.service.EmployeeService;



@SpringBootApplication
public class ProjetSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringAngularApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(EmployeeService employeeService) {
		return args ->{
			employeeService.saveEmployee(new Employee(1,"saddem", "ouannessi", "saddem@gmail.com"));
			employeeService.saveEmployee(new Employee(2,"oussama", "jaziri", "oussama@gmail.com"));
			employeeService.saveEmployee(new Employee(3,"hamza", "bouachir", "hamza@gmail.com"));
			employeeService.saveEmployee(new Employee(4,"oussama ben salha", "ben salha", "bensalha@gmail.com"));
			employeeService.saveEmployee(new Employee(5,"ali", "bouzaiene", "ali@gmail.com"));
		};
		
	}

}
