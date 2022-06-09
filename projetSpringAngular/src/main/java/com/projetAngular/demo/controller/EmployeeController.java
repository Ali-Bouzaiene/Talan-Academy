package com.projetAngular.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping ("/employees/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return employeeService.getEmployee(id);
	}
	@PostMapping ("/employees")
	public Employee saveEmployee (@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);		
	} 
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
		return employeeService.updateEmployee(id, employeeDetails);		
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable long id) {
		employeeService.deleteEmployee(id); 
	} 
}
