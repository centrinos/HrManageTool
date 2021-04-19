package com.csssi.manage.mvcconfig;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    public static String[] IGNORE_PATH = {"/login_in", "/login", "/error"};

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
	/*	Object o = request.getSession().getAttribute("isLogin");
		if (o != null && o.equals(true)) {
			return true;
		} else {
			request.getSession().setAttribute("message", "请先登录");
			request.getRequestDispatcher("/login").forward(request, response);
		//	response.sendRedirect("/login");
			return false;
		}
*/
        return true;
    }
}
