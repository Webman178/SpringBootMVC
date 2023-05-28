package com.example.springbootmvc.repository;

import com.example.springbootmvc.pojo.Employee;

import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    private final List<Employee> employeesList = List.of(
            new Employee("Маша",50_000),
            new Employee("Дима",152_000),
            new Employee("Тимур", 47_000),
            new Employee("Сергей", 50_000),
            new Employee("Иван", 85_000),
            new Employee("Алексей", 200_000));
    @Override
    public List<Employee> getAllEmployee() {
        return employeesList;
    }

    @Override
    public String getSalarySum() {
        return "Sum of Salary = "+employeesList.stream().map(x->x.getSalary()).mapToInt(y->y.intValue()).sum();
    }

    @Override
    public String getMinSalary() {
        return "Min salary = "+employeesList.stream().map(x->x.getSalary()).mapToInt(y->y.intValue()).min().orElse(0);
    }

    @Override
    public String getMaxSalary() {
        return "MAX salary = "+employeesList.stream().map(x->x.getSalary()).mapToInt(y->y.intValue()).max().orElse(0);
    }

    @Override
    public List<Employee> getEmployeeWithHighSalary() {
        OptionalDouble averageSalary = employeesList.stream().map((x)->x.getSalary()).mapToInt(y->y.intValue()).average();
        return employeesList.stream().filter(x->x.getSalary()>=averageSalary.getAsDouble()).collect(Collectors.toList());
    }
}
