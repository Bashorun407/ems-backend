package com.bashenterprise.ems.mapper;

import com.bashenterprise.ems.dto.EmployeeDto;
import com.bashenterprise.ems.entity.Employee;
import org.jetbrains.annotations.NotNull;

public class EmployeeMapper {

    @NotNull
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    @NotNull
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}