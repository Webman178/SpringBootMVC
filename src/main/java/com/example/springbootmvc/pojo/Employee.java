package com.example.springbootmvc.pojo;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " [ "+name+" - "+ salary+" ] ";
    }
}
