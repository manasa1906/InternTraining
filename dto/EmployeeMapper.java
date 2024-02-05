package com.restAPI.employeeManagement.dto;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.restAPI.employeeManagement.dto.request.EmployeeRequest;
import com.restAPI.employeeManagement.dto.response.EmployeeResponse;
import com.restAPI.employeeManagement.entity.employeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public class EmployeeMapper {
	  EmployeeMapper MAPPER = MapperConfig.getMapper(EmployeeMapper.class);
	  employeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);
	  EmployeeResponse fromEntityToResponse(employeeEntity employeeEntity);
}
