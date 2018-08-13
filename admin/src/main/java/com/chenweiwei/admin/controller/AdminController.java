package com.chenweiwei.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenweiwei.admin.entity.User;

@Controller
@RequestMapping("/")
public class AdminController {

	@RequestMapping("login")
	public String index() {
		return "login";
	}
	
	@RequestMapping("admin")
	public String admin(HttpSession session) {
		User user = new User();
		user.setUserId("1752083854");
		user.setUserName("oxygen");
		user.setUserPwd("123456");
		session.setAttribute("user", user);
		return "admin";
	}
	
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("test/test")
	public String test() {
		return "test/test";
	}
}
