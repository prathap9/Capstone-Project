package com.hdfc.ems.service;


import com.hdfc.ems.dto.EmployeeDTO;

import com.hdfc.ems.exception.EmployeeNotFound;

public interface IEmployeeService {
	
	public EmployeeDTO getEmployee(long id) throws EmployeeNotFound,Exception;

}

