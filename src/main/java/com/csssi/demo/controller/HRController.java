package com.csssi.demo.controller;

import com.csssi.demo.domain.Department;
import com.csssi.demo.domain.Employee;
import com.csssi.demo.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/query")
public class HRController {

    @Autowired
    @Qualifier("hrService")
    HRService hrService;


    @GetMapping(value = "/departments/{deptId}")
    public Department queryDepartment(@PathVariable(value = "deptId") int deptId) {
        return hrService.getDepartmentByID(deptId);
    }
}
