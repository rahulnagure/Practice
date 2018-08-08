package com.roombooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.roombooking.entity.Employee;
import com.roombooking.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;  
	
	public Page<Employee> findAllEmployees(Pageable pageable){
		return employeeRepository.findAll(pageable);
	}
	
	public Employee create(Employee employee){
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(Long employeeId){
		return employeeRepository.findOne(employeeId);
	}
	
	public void deleteEmployee(Long employeeId){
		employeeRepository.delete(employeeId);
	}
	
	public Employee updateEmployee(Employee employee){
		return employeeRepository.save(employee);
	}

	
}
