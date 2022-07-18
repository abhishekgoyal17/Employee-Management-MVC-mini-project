package com.abhishekgoyal.springMVC.service;

import java.util.List;

import com.abhishekgoyal.springMVC.model.Employee;



public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}