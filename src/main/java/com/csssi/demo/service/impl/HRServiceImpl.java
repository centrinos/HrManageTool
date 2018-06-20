package com.csssi.demo.service.impl;

import com.csssi.demo.domain.Department;
import com.csssi.demo.domain.Employee;
import com.csssi.demo.mapper.DepartmentMapper;
import com.csssi.demo.mapper.EmployeeMapper;
import com.csssi.demo.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("hrService")
public class HRServiceImpl implements HRService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMapper.selectEmployeeByID(id);
    }

    @Override
    public Department getDepartmentByID(int id) {
        return departmentMapper.selectDeptByID(id);
    }
}
