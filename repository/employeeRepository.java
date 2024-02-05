package com.restAPI.employeeManagement.repository;

import com.restAPI.employeeManagement.entity.employeeEntity;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

@Repository
public class employeeRepository extends JpaRepositoryExtension<employeeEntity, Long>{

}
