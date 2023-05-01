package com.hdfc.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.ems.entity.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {

	
}
