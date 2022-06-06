package com.projetAngular.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetAngular.demo.Entity.Employee;
import com.projetAngular.demo.exception.ResourceNotFoundException;
import com.projetAngular.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {		
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);		
	}

	@Override
	public Employee updateEmployee(long id, Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :"+ id));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		Employee updateEmployee = employeeRepository.save(employee);
		
		return updateEmployee;
	}
	
}
