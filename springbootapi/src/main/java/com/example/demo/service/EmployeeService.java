package com.example.demo.service;

import com.example.demo.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}
