package com.csssi.demo.mapper;

import com.csssi.demo.domain.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface DepartmentMapper {

    @Select("")
    Department selectDepartByID(int id);

    @Select("")
    ArrayList<Department> selectAllDeparts();

    @Select("")
    Department selectEmployeesByDepartID();

    @Insert("")
    void insetDepartment();
}
