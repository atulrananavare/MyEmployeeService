package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return emp;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return emp;
    }

    @Override
    public void deleteEmployee(Integer empId) {
        employeeRepo.deleteById(empId);
    }

    @Override
    public Optional<Employee> getEmployeeById(Integer empId) {
        return employeeRepo.findById(empId);
    }

    @Override
    public Employee partialUpdateEmployee(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return emp;
    }

    public List<Employee> getEmployeeGreaterThanAge(Integer age) {
        return employeeRepo.findAll().stream().filter(x -> x.getAge() > age).collect(Collectors.toList());
    }

    public List<Employee> getEmployeeLesserThanAge(Integer age) {
        return employeeRepo.findAll().stream().filter(x -> x.getAge() < age).collect(Collectors.toList());
    }

    public List<Employee> getEmployeeByName(String firstName) {
        return employeeRepo.findAll().stream().filter(x -> x.getEmpFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
    }
}
