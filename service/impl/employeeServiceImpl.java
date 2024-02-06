package com.restAPI.employeeManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.restAPI.employeeManagement.entity.employeeEntity;
import com.restAPI.employeeManagement.repository.employeeRepository;
import com.restAPI.employeeManagement.service.EmployeeService;
@Service
public class employeeServiceImpl  implements EmployeeService {
	


	    private final employeeRepository employeeRepository;

	    public employeeServiceImpl(employeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }

	    @Override
	    public List<employeeEntity> findAllEmployee() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Optional<employeeEntity> findById(Long id) {
	        return employeeRepository.findById(id);
	    }

	    @Override
	    public employeeEntity saveEmployee(employeeEntity employeeEntity) {
	        return employeeRepository.save(employeeEntity);
	    }

	    @Override
	    public employeeEntity updateEmployee(employeeEntity employeeEntity) {
	        return employeeRepository.save(employeeEntity);
	    }

	    @Override
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }

	   
	    }




