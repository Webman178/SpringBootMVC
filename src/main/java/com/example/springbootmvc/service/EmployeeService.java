package com.example.springbootmvc.service;

import com.example.springbootmvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public String getSalarySum();

    public String getMinSalary();

    public String getMaxSalary();

    public List<Employee> getEmployeeWithHighSalary();
}
