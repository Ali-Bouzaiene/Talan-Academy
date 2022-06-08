package com.projetAngular.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetAngular.demo.Entity.Employee;
import com.projetAngular.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping ("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();		
	}
	@PostMapping ("/employees")
	public Employee saveEmployee (@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);		
	} 
	@DeleteMapping("/delete/employee")
	public void deleteEmployee() {
		employeeService.deleteEmployee(8); 
	} 
	@PutMapping("/update/{id}")
	public Employee updateEmployee() {
		return employeeService.updateEmployee(0, null);
		
	}
}
