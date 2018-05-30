package com.csssi.demo.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.csssi.demo.domain.User;
import com.csssi.demo.service.LoginService;
import com.csssi.demo.util.DemoConstants;

@Controller
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;

	@RequestMapping(value = "/login_in", method = RequestMethod.POST)
	public ModelAndView loginin(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			HttpSession session, ModelAndView mv, RedirectAttributes redirectAttributes) {

		LOGGER.info("Login in start");
		User user = loginService.login(loginname, password);
		if (user == null) {
			LOGGER.info("Login failed");
			mv.addObject("message", "用户不存在或密码错误");
			mv.setViewName("/login");
		} else {
			session.setAttribute(DemoConstants.LOGIN, true);
			mv.setViewName("redirect:/hrManagement/" + user.getUsername());
			LOGGER.info("login in succeed");
		}
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/hrManagement/{username}")
	public String aliyunFuncTest(@PathVariable String username, Model model) {
		model.addAttribute("username", username);
		return "hrManagement";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		session.removeAttribute(DemoConstants.LOGIN);
		LOGGER.info("Doing logout");
		return "redirect:/login";
	}

}
