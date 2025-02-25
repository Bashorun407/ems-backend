package com.bashenterprise.ems.controller;

import com.bashenterprise.ems.dto.EmployeeDto;
import com.bashenterprise.ems.mapper.EmployeeMapper;
import com.bashenterprise.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    //Build POST Employee REST API
    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> CreateEmployee(@RequestBody EmployeeDto employeeDto){

        EmployeeDto savedEmployeeDto = employeeService.createEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }

    //Build GET Employee REST API
    @GetMapping("/employeeById/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeId(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);

        return ResponseEntity.ok(employeeDto);
    }

    //Build GET ALL Employee REST API
    @GetMapping("/allEmployees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDtos = employeeService.getAllEmployees();

        return ResponseEntity.ok(employeeDtos);
    }

    //Build PUT Employee REST API
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable ("id") Long employeeId, @RequestBody EmployeeDto employeeDto){
        EmployeeDto updatedEmployeeDto = employeeService.updateEmployee(employeeId, employeeDto);

        return ResponseEntity.ok(updatedEmployeeDto);
    }

    //Build DELETE Employee REST API
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);

        return ResponseEntity.ok("Employee deleted successfully");
    }
}

