package com.hdfc.ems.servicetest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.hdfc.ems.dto.EmployeeDTO;
import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.EmployeeNotFound;
import com.hdfc.ems.service.IEmployeeService;

@SpringBootTest
public class EmployeeServiceTest {

	
	 @Autowired IEmployeeService service;
	  
	 @Test void testGetEmployee() throws EmployeeNotFound,Exception { EmployeeDTO
	 emp=service.getEmployee(1); assertNotNull(emp); }
	 
}
