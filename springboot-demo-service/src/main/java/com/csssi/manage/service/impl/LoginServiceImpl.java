package com.csssi.manage.service.impl;

import com.csssi.manage.entity.User;
import com.csssi.manage.mapper.UserRepository;
import com.csssi.manage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User login(String loginName, String password) {
		return userRepository.getByUsernameAndPassword(loginName, password);
	}

}
