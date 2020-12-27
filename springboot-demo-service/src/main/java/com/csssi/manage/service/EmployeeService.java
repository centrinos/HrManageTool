package com.csssi.manage.service;


import com.csssi.manage.entity.Department;
import com.csssi.manage.entity.Employee;

public interface EmployeeService {

     Employee getEmployeeById(long id);

     Department getDepartmentByID(long id);
}
