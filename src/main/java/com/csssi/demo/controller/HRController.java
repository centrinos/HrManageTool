package com.csssi.demo.controller;

import com.csssi.demo.domain.Department;
import com.csssi.demo.domain.Employee;
import com.csssi.demo.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HRController {

    @Autowired
    @Qualifier("hrService")
    HRService hrService;


    @GetMapping(value = "/abc")
    public String search() {
        Department department = hrService.getDepartmentByID(1);
        StringBuffer sb = new StringBuffer();
        sb.append(department.toString());
        ArrayList<Employee> list = department.getEmployees();
        for(Employee e: list) {
            sb.append(e.toString());
        }
      // .forEach(emp->sb.append(emp.toString()));
        return sb.toString();
    }
}
