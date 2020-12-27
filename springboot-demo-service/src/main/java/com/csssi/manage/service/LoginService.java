package com.csssi.manage.service;

import com.csssi.manage.entity.User;

public interface LoginService {

    User login(String loginName, String password);

}
