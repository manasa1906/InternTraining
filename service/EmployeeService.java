package com.restAPI.employeeManagement.service;


import java.util.List;
import java.util.Optional;

import com.restAPI.employeeManagement.dto.request.EmployeeRequest;
import com.restAPI.employeeManagement.dto.response.EmployeeResponse;
import com.restAPI.employeeManagement.entity.employeeEntity;
public interface EmployeeService {
	 public abstract List<employeeEntity> findAllEmployee();
	 public abstract Optional<employeeEntity> findById(Long id);
	    public abstract employeeEntity saveEmployee(employeeEntity employeeEntity);
	   public   abstract employeeEntity updateEmployee(employeeEntity employeeEntity);
	    public abstract void deleteEmployee(Long id);

	    public abstract EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);
	   public abstract EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);
}
