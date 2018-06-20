package com.csssi.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csssi.demo.domain.User;
import com.csssi.demo.mapper.UserMapper;
import com.csssi.demo.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String loginname, String password) {
		return userMapper.getLoginUser(loginname, password);
	}

}
