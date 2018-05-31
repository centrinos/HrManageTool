package com.csssi.demo.mapper;

import com.csssi.demo.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface EmployeeMapper {

    @Select("select * from tb_employee where em_id = {ID}")
    Employee selectEmployeeByID(@Param(value = "ID") int id);

    @Select("select * from tb_employee")
    ArrayList<Employee> selectAllEmployees();

    @Insert("")
    void insertEmployee();

    @Update("")
    void updateEmployeeLevel();

    @Delete("")
    void deleteEmployee();
}
