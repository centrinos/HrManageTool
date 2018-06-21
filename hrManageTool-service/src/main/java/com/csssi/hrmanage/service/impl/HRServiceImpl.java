package com.csssi.hrmanage.service.impl;

import com.csssi.hrmanage.entity.Department;
import com.csssi.hrmanage.entity.Employee;
import com.csssi.hrmanage.mapper.DepartmentMapper;
import com.csssi.hrmanage.mapper.EmployeeMapper;
import com.csssi.hrmanage.service.HRService;
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
