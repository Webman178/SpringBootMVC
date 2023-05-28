package com.example.springbootmvc.controller;

import com.example.springbootmvc.pojo.Employee;
import com.example.springbootmvc.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    @GetMapping
    public List<Employee> showCounter() {
        return  employeeService.getAllEmployee();
    }
    @GetMapping("/salary/sum")
    public String showSum() {
        return  employeeService.getSalarySum();
    }
    @GetMapping("/salary/min")
    public String showMinSalary() {
        return  employeeService.getMinSalary();
    }
    @GetMapping("/salary/max")
    public String showMaxSalary() {
        return  employeeService.getMaxSalary();
    }
    @GetMapping("/salary/high-salary")
    public List<Employee> showWithHighSalary() {
        return  employeeService.getEmployeeWithHighSalary();
    }

}
