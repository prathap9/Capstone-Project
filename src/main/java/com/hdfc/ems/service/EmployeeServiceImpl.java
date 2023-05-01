package com.hdfc.ems.service;




import com.hdfc.ems.entity.Employee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.dto.EmployeeDTO;
import com.hdfc.ems.exception.EmployeeNotFound;
import com.hdfc.ems.repository.IEmployeeRepository;
import com.hdfc.ems.util.AESEncrypt;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository emprepo;
	
	private static final Logger log=Logger.getLogger(EmployeeServiceImpl.class);
	
	@Override
	public EmployeeDTO getEmployee(long id) throws EmployeeNotFound,Exception {
		
		Employee emp=emprepo.findById(id).orElse(null);
		
		if(!emprepo.existsById(id)) {
			log.error("Invalid EmployeeID");
			throw new EmployeeNotFound("EmployeeNotFound");
		}
		log.info("Employee Details Shown successfully!");
		
		return convertDTO(emp);
	}
	
	public EmployeeDTO convertDTO(Employee emp) throws Exception {
		EmployeeDTO empdto=new EmployeeDTO();
		empdto.setEmployeeId(emp.getEmployeeId());
		empdto.setEmployeeName(emp.getEmployeeName());
		empdto.setDateOfBirth(AESEncrypt.encrypt(emp.getDateOfBirth()));
		return empdto;
	}
	
	
}

