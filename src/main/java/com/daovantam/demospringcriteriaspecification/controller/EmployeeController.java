package com.daovantam.demospringcriteriaspecification.controller;


import com.daovantam.demospringcriteriaspecification.dto.EmployeeDTO;
import com.daovantam.demospringcriteriaspecification.service.IEmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employee")
    public List<EmployeeDTO> getEmployees(){
        return employeeService.findAll();
    }

    @PostMapping("/search/employee1")
    public List<EmployeeDTO> findEmployeeByIdAndAge(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.findAllByIdAndAge(employeeDTO);
    }

    @PostMapping("/search/employee2")
    public List<EmployeeDTO> findEmployeeByAddressAndGender(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.findAllByAddressAndGender(employeeDTO);
    }

}
