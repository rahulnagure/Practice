package com.roombooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.Employee;
import com.roombooking.enumerations.Role;
import com.roombooking.services.EmployeeService;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 
	
	/**
	 * To find all employees 
	 * @return
	 */
	@GetMapping
	public Page<Employee> findAllEmployees(Pageable pageable){		
		 
		Page<Employee> employeeList = employeeService.findAllEmployees(pageable);
		for(Employee employee: employeeList){
			System.out.println(employee.toString());
		}
		return employeeList;
	}
	
	/**
	 * creates a new employee
	 * @param employee
	 * @return
	 */
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee){
		
		//employee.setRoleId(1);
		employee.setRoleId(Role.USER.ordinal());
		
		return employeeService.create(employee);
	}
	
	/**
	 * Gets a particular employee with its id
	 * @param id
	 * @return
	 */
	@GetMapping("/{employeeId:[1-9]\\d*}")
	public Employee getEmployeebyId(@PathVariable("employeeId") Long employeeId){
		return employeeService.getEmployeeById(employeeId);
	}
	
	/**
	 * Deletes an employee 
	 * @param employee
	 */
	@DeleteMapping(path="/{employeeId:[1-9]\\d*}}")
	public void deleteEmployeebyId(@PathVariable("employeeId") Long employeeId){
		employeeService.deleteEmployee(employeeId);
	}
	
	/**
	 * Updates an employee
	 * @param employee
	 * @return
	 */
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee){
		employee.setRoleId(Role.USER.ordinal());
		return employeeService.updateEmployee(employee);
	}

}
