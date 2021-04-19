package com.csssi.manage.service;

import com.csssi.manage.entity.Department;

public interface DepartmentService {

    void createDepartment(Department department);

    void deleteDepartment(Department department);

    Department getById(long id);

}
