package com.hdfc.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.ems.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee,Long> {

	
}
