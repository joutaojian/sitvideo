package com.tajok.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tajok.model.Admin;
import com.tajok.service.IAdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource
	private IAdminService adminService;//将本地的userService属性注入，等同且替代了setter
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) //带占位符的URL
	public String login(HttpServletRequest request,HttpSession session,@RequestParam String email,@RequestParam String password) {//@PathVariable用来动态传参，url更美观
		
		if(adminService.loginCheck(email,password))
		{
			Admin admin = adminService.getModel(email);
			session.setAttribute("admin", admin);
			return "/WEB-INF/jsp/index.jsp";
		}else
			request.setAttribute("error", "Account or password error!");
		//		return "redirect:/admin/loginUI.html"; //重定向
		return "/WEB-INF/jsp/loginUI.jsp";//转发才能接收到request
	}
	
	@RequestMapping(value = "/loginUI")
	public String loginUI() {
		return "/WEB-INF/jsp/loginUI.jsp";
	}
	
	@RequestMapping(value = "/logout")
	public String loginout(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		Admin admin = (Admin) session.getAttribute("admin"); 
		System.out.println(admin!=null?admin.getId():"没有session");
		session.removeAttribute("admin");
		Admin admins = (Admin) session.getAttribute("admin"); 
		System.out.println(admins!=null?admins.getId():"没有session");
		return "/WEB-INF/jsp/loginUI.jsp";
	}
}
