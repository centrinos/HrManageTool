package com.csssi.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.csssi.demo.domain.User;

@Mapper
public interface UserMapper {

	@Select("select * from tb_user where col_username = #{loginname} and col_password = #{password}")
	@Results({ @Result(id = true, property = "id", column = "col_id"),
			@Result(property = "username", column = "col_username"), @Result(property = "level", column = "col_level") })
	User getLoginUser(@Param(value = "loginname") String loginname, @Param(value = "password") String password);
}
