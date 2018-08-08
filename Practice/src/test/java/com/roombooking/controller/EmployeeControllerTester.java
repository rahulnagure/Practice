package com.roombooking.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.roombooking.entity.Employee;
import com.roombooking.services.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTester {
	
	@InjectMocks
	private EmployeeController employeeController;
	
	@Mock
	private EmployeeService employeeService;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
		EmployeeTestObjects.initObjects();
	}
	
//	@Test
//	public void testGetEmployees() throws Exception{
//		Page<Employee> expected = EmployeeTestObjects.EMPLOYEE_PAGE;
//		when(employeeService.findAllEmployees(any(Pageable.class))).thenReturn(expected);
//		mockMvc.perform(get("/api/employees")).andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
//	}
	
	@Test
	public void testGetEmployee() throws Exception{
		Employee expected = EmployeeTestObjects.EMPLOYEE_ONE;
		when(employeeService.getEmployeeById(any(Long.class))).thenReturn(expected);
		mockMvc.perform(get("http://127.0.0.1:8081/api/employees/1")).andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
	}
}
