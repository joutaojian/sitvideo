package com.tajok.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tajok.model.Admin;
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
		
		return "/WEB-INF/jsp/front/showUser.jsp";
	}
	
	@RequestMapping("/auditUser/{id}")
	public String auditUser(HttpServletRequest request,@PathVariable int id) {
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		
		HttpSession session = request.getSession();
		User users = (User) session.getAttribute("user"); 
		System.out.println(users!=null?users.getId():"没有session");
		
		
		return "/WEB-INF/jsp/front/auditUser.jsp";
	}
	
	@RequestMapping("/guest")
	public String guest(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/guest.jsp";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/index.jsp";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/register.jsp";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(HttpServletRequest request,HttpSession session,@RequestParam String email,@RequestParam String password) {//@PathVariable用来动态传参，url更美观
		
		if(userService.loginCheck(email,password))
		{
			User user = userService.getModel(email);
			session.setAttribute("user", user);
			return "/WEB-INF/jsp/front/index.jsp";
		}else
			request.setAttribute("error", "账号/密码错误！");
		//		return "redirect:/admin/loginUI.html"; //重定向
		return "/WEB-INF/jsp/front/guest.jsp";//转发才能接收到request
	}
	
	@RequestMapping(value = "/logout")
	public String loginout(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		Admin admin = (Admin) session.getAttribute("admin"); 
		System.out.println(admin!=null?admin.getId():"没有session");
		session.removeAttribute("admin");
		Admin admins = (Admin) session.getAttribute("admin"); 
		System.out.println(admins!=null?admins.getId():"没有session");
		return "/WEB-INF/jsp/back/loginUI.jsp";
	}
}
