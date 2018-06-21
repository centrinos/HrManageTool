package com.csssi.hrmanage.service;


import com.csssi.hrmanage.entity.User;

public interface LoginService {

	 User login(String loginname, String password);

}
