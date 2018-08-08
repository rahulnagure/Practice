package com.roombooking.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.roombooking.entity.Employee;

public class EmployeeTestObjects {
	
	public static Employee EMPLOYEE_ONE;
	public static List<Employee> EMPLOYEE_LIST;
	public static Page<Employee> EMPLOYEE_PAGE;
	
	public static void initObjects(){
		EMPLOYEE_ONE = new Employee();
		EMPLOYEE_ONE.setFirstName("ABC");
		EMPLOYEE_ONE.setLastName("XYZ");
		EMPLOYEE_ONE.setEmail("xyzabc@mail.com");
		EMPLOYEE_ONE.setUserName("xabc");
		EMPLOYEE_ONE.setActive(true);
		EMPLOYEE_ONE.setEmployeeId(1L);
		
		EMPLOYEE_LIST = new ArrayList<>();
		EMPLOYEE_LIST.add(EMPLOYEE_ONE);
		EMPLOYEE_PAGE = new PageImpl<>(EMPLOYEE_LIST);
	}
}
