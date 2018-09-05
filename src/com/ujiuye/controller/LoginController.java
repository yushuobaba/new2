package com.ujiuye.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ujiuye.bean.User;

@Controller
public class LoginController {
		@RequestMapping("login")
		public String login(@RequestParam("user") User user,HttpSession session) {
			session.setAttribute("user", user);
			System.out.println("œ»÷¥––4");
			return "success";
		}
		
}
