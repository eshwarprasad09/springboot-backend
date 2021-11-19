package com.springbootsecondapp.service;

import com.springbootsecondapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeId(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
