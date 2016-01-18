package com.tajok.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tajok.model.User;
import com.tajok.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;//将本地的userService属性注入，等同且替代了setter

	/*
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	*/
	
	@RequestMapping("/showUser/{id}") //带占位符的URL
	public String showUser(HttpServletRequest request,@PathVariable int id,HttpSession session) {//@PathVariable用来动态传参，url更美观
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		
		session.setAttribute("user", user);
		
		return "/WEB-INF/jsp/showUser.jsp";
	}
	
	@RequestMapping("/auditUser/{id}")
	public String auditUser(HttpServletRequest request,@PathVariable int id) {
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		
		HttpSession session = request.getSession();
		User users = (User) session.getAttribute("user"); 
		System.out.println(users!=null?users.getId():"没有session");
		
		
		return "/WEB-INF/jsp/auditUser.jsp";
	}
}
