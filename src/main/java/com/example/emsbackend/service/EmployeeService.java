package com.example.emsbackend.service;

import com.example.emsbackend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {


    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long employeeId);

    void deleteEmployee(Long employeeId);
}
