package com.employee.service;

import com.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(Integer empId);

    public Optional<Employee> getEmployeeById(Integer empId);

    public Employee partialUpdateEmployee(Employee employee);
}
