package com.example.emsbackend.controller;

import com.example.emsbackend.dto.EmployeeDto;
import com.example.emsbackend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    //Build create a new employeecreat
    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeedto){
        EmployeeDto employeeDto = employeeService.createEmployee(employeedto);
        return ResponseEntity.ok(employeeDto);
    }


    //get employee by id
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }


    //get all employee
    public ResponseEntity<List<EmployeeDto>> getAllEmploy (){
        List<EmployeeDto> employeeList = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeList);
    }


    //update employee
    @PutMapping("/{id}")
    public  ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable("id") Long employeeId){
        EmployeeDto returnEmployeeDto = employeeService.updateEmployee(employeeDto, employeeId);
        return ResponseEntity.ok(returnEmployeeDto);
    }


    //delete employee by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("deleted");
    }
}
