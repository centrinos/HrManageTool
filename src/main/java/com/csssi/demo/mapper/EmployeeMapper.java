package com.csssi.demo.mapper;

import com.csssi.demo.domain.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.ArrayList;

@Mapper
public interface EmployeeMapper {

    @Select("select * from tb_employee where em_deptid = #{ID}")
    @Results({
            @Result(id=true,column = "em_id",property = "empId"),
            @Result(column = "em_name",property = "name"),
            @Result(column = "em_sex",property =  "sex"),
            @Result(column = "em_level",property = "level"),
            @Result(column = "em_salary",property = "salary")
    })
    ArrayList<Employee> selectEmployeeByDeptID(@Param(value = "ID") int deptId);

    @Select("select * from tb_employee where em_id = #{id}")
    @Results({
            @Result(id=true,column = "em_id",property = "empId"),
            @Result(column = "em_name",property = "name"),
            @Result(column = "em_sex",property =  "sex"),
            @Result(column = "em_level",property = "level"),
            @Result(column = "em_deptid",property = "department",
                    one=@One(select = "com.csssi.demo.mapper.DepartmentMapper.selectDeptByID",
                            fetchType = FetchType.EAGER)),
            @Result(column = "em_salary",property = "salary")
    })
    Employee selectEmployeeByID(@Param(value = "id") int id);

  /*  @Insert("")
    void insertEmployee();

    @Update("")
    void updateEmployeeLevel();

    @Delete("")
    void deleteEmployee();*/
}
