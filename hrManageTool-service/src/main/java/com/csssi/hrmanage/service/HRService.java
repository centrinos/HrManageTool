package com.csssi.hrmanage.service;


import com.csssi.hrmanage.entity.Department;
import com.csssi.hrmanage.entity.Employee;

public interface HRService {

     Employee getEmployeeById(int id);

     Department getDepartmentByID(int id);
}
