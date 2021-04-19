package com.csssi.manage.service.impl;

import com.csssi.manage.entity.Department;
import com.csssi.manage.mapper.DepartmentRepository;
import com.csssi.manage.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public Department getById(long id) {
        return departmentRepository.getOne(id);
    }
}
