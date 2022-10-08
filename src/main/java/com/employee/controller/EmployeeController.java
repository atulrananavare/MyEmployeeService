package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees() {
        return employeeServiceImpl.getAllEmployee();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.addEmployee(employee);
    }

    @GetMapping("/greaterThan/{age}")
    public List<Employee> getEmployeeByAge(@PathVariable Integer age) {
        return employeeServiceImpl.getEmployeeGreaterThanAge(age);
    }

    @GetMapping("/lessThan/{age}")
    public List<Employee> getEmployeeByAgeLesser(@PathVariable Integer age) {
        return employeeServiceImpl.getEmployeeLesserThanAge(age);
    }

    @GetMapping("/{firstName}")
    public List<Employee> getEmployeeByAge(@PathVariable String firstName) {
        return employeeServiceImpl.getEmployeeByName(firstName);
    }
}
