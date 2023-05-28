package com.example.springbootmvc.service;
import com.example.springbootmvc.pojo.Employee;
import com.example.springbootmvc.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository=employeeRepository;
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    public String getSalarySum() {
        return employeeRepository.getSalarySum();
    }

    @Override
    public String getMinSalary() {
        return  employeeRepository.getMinSalary();
    }

    @Override
    public String getMaxSalary() {
        return employeeRepository.getMaxSalary();
    }

    @Override
    public List<Employee> getEmployeeWithHighSalary() {
        return employeeRepository.getEmployeeWithHighSalary();
    }
}

