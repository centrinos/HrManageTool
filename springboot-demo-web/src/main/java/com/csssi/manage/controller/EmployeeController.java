package com.csssi.manage.controller;


import com.csssi.manage.entity.Department;
import com.csssi.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/query")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = "/departments/{deptId}")
    public Department queryDepartment(@PathVariable(value = "deptId") int deptId) {
        return employeeService.getDepartmentByID(deptId);
    }
}
