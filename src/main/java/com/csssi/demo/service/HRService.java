package com.csssi.demo.service;

import com.csssi.demo.domain.Department;
import com.csssi.demo.domain.Employee;

public interface HRService {

     Employee getEmployeeById(int id);

     Department getDepartmentByID(int id);
}
