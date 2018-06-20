package com.csssi.demo.mapper;

import com.csssi.demo.domain.Department;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.ArrayList;

@Mapper
public interface DepartmentMapper {

    @Select("Select * from tb_department where de_id = #{id}")
    @Results({
            @Result(id = true, column = "de_id", property = "deptId"),
            @Result(column = "de_name", property = "deptName"),
            @Result(column = "de_id", property = "employees",
                    many = @Many(select = "com.csssi.demo.mapper.EmployeeMapper.selectEmployeeByDeptID",
                    fetchType = FetchType.LAZY
            ))
    })
    Department selectDeptByID(int id);

    @Select("Select * from tb_department")
    ArrayList<Department> selectAllDeparts();

}
