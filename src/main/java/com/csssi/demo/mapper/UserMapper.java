package com.csssi.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.csssi.demo.domain.User;

@Mapper
public interface UserMapper {

	@Select("select * from tb_user where tb_name = #{loginname} and tb_password = #{password}")
	@Results({ @Result(id = true, property = "id", column = "tb_id"),
			@Result(property = "username", column = "tb_name"), @Result(property = "level", column = "tb_level") })
	User getLoginUser(@Param(value = "loginname") String loginname, @Param(value = "password") String password);
}
