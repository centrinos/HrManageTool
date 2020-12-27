package com.csssi.manage.service.impl;

import com.csssi.manage.entity.Department;
import com.csssi.manage.entity.Employee;
import com.csssi.manage.mapper.DepartmentRepository;
import com.csssi.manage.mapper.EmployeeRepository;
import com.csssi.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public Department getDepartmentByID(long id) {
        return departmentRepository.getOne(id);
    }
}
