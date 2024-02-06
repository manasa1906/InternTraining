package com.restAPI.employeeManagement.service;


import java.util.List;

import java.util.Optional;

import com.restAPI.employeeManagement.entity.employeeEntity;
public interface EmployeeService {
	 List<employeeEntity> findAllEmployee();
	 Optional<employeeEntity> findById(Long id);
	   employeeEntity saveEmployee(employeeEntity employeeEntity);
	  employeeEntity updateEmployee(employeeEntity employeeEntity);
	  void deleteEmployee(Long id);

	    
}
