package com.csssi.hrmanage.mapper;

import com.csssi.hrmanage.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from tb_user where u_username = #{loginname} and u_password = #{password}")
    @Results({@Result(id = true, property = "id", column = "u_id"),
              @Result(property = "username", column = "u_username"),
              @Result(property = "level", column = "u_level")})
    User getLoginUser(@Param(value = "loginname") String loginname, @Param(value = "password") String password);
}
