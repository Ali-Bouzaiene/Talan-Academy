package com.projetAngular.demo.service;

import java.util.List;

import com.projetAngular.demo.Entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee getEmployee(long id);
	Employee saveEmployee(Employee employee);
	void deleteEmployee(long id);	
	Employee updateEmployee (long id, Employee employeeDetails);
	
}
