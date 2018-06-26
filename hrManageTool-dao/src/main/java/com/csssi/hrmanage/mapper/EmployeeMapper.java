package com.csssi.hrmanage.mapper;

import com.csssi.hrmanage.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
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
                    one=@One(select = "com.csssi.hrmanage.mapper.DepartmentMapper.selectDeptByID",
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
