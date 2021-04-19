package com.csssi.manage.service.impl;

import com.csssi.manage.entity.Employee;
import com.csssi.manage.mapper.EmployeeRepository;
import com.csssi.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getById(long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee = getById(id);
        if (employee != null) {
            employeeRepository.delete(employee);
        }
    }

    @Override
    public Employee getByDepartmentId(long id) {
        return employeeRepository.getByDepartmentId(id);
    }

}
