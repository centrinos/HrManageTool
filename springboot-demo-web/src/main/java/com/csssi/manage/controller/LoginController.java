package com.csssi.manage.controller;

import com.csssi.manage.entity.User;
import com.csssi.manage.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login_in", method = RequestMethod.POST)
	public ModelAndView loginin(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			HttpSession session, ModelAndView mv,RedirectAttributes redirectAttributes) {

		LOGGER.info("Login in start");
		User user = loginService.login(loginname, password);
		if (user == null) {
			LOGGER.info("Login failed");
			mv.addObject("message", "用户不存在或密码错误");
			mv.setViewName("/login");
		} else {
			session.setAttribute("isLogin", true);
			redirectAttributes.addFlashAttribute("username", user.getUsername());
			mv.setViewName("redirect:/hrManagement/");
			LOGGER.info("login in succeed");
		}
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/hrManagement")
	public String hrManagement() {
		return "EmployeeManage";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		session.removeAttribute("isLogin");
		LOGGER.info("Doing logout");
		return "redirect:/login";
	}

}
