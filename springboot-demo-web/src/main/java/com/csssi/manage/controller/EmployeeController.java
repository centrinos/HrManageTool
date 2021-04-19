package com.csssi.manage.controller;

import com.csssi.manage.entity.Employee;
import com.csssi.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/{id}")
    public Employee queryById(@PathVariable(value = "id") long id) {
        return employeeService.getById(id);
    }

    @PostMapping(value = "/")
    public Employee create(Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") long id) {
        employeeService.deleteEmployee(id);
    }
}
