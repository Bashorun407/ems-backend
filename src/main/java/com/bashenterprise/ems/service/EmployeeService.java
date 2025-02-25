package com.bashenterprise.ems.service;

import com.bashenterprise.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public EmployeeDto createEmployee (EmployeeDto employeeDto);

    public EmployeeDto getEmployeeById(Long employeeId);

    public List<EmployeeDto> getAllEmployees();

    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    public void  deleteEmployee(Long employeeId);
}
