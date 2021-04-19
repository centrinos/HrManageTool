package com.csssi.manage.service;

import com.csssi.manage.entity.Employee;

public interface EmployeeService {

     Employee getById(long id);

     Employee createEmployee(Employee employee);

     void deleteEmployee(long id);

     Employee getByDepartmentId(long id);
}
