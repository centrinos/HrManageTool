package com.csssi.hrmanage.service.impl;

import com.csssi.hrmanage.entity.User;
import com.csssi.hrmanage.mapper.UserMapper;
import com.csssi.hrmanage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String loginname, String password) {
		return userMapper.getLoginUser(loginname, password);
	}

}
