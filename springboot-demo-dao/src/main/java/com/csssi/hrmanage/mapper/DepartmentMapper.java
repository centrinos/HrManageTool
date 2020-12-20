package com.csssi.hrmanage.mapper;

import com.csssi.hrmanage.entity.Department;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface DepartmentMapper {

    @Select("Select * from tb_department where de_id = #{id}")
    @Results({
            @Result(id = true, column = "de_id", property = "deptId"),
            @Result(column = "de_name", property = "deptName"),
            @Result(column = "de_id", property = "employees",
                    many = @Many(select = "com.csssi.hrmanage.mapper.EmployeeMapper.selectEmployeeByDeptID",
                    fetchType = FetchType.LAZY
            ))
    })
    Department selectDeptByID(@Param("id") int id);

    @Select("Select * from tb_department")
    ArrayList<Department> selectAllDeparts();

}
