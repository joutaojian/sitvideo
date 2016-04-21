package com.tajok.web.backend.controller;


import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tajok.web.backend.model.Admin;
import com.tajok.web.backend.service.IAdminService;
import com.tajok.web.frontkit.service.IMovService;
import com.tajok.web.frontkit.service.IUserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource
	private IAdminService adminService;//将本地的userService属性注入，等同且替代了setter
	@Resource
	private IUserService userService;//将本地的userService属性注入，等同且替代了setter
	@Resource
	private IMovService movService;//将本地的userService属性注入，等同且替代了setter
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(HttpServletRequest request,HttpSession session,@RequestParam String email,@RequestParam String password) {//@PathVariable用来动态传参，url更美观
		
		if(adminService.loginCheck(email,password))
		{
			Admin admin = adminService.getModel(email);
			session.setAttribute("admin", admin);
			return "redirect:/admin/userManager.do";
		}else
			request.setAttribute("error", "Account or password error!");
		//		return "redirect:/admin/loginUI.do"; //重定向
		return "/WEB-INF/jsp/back/loginUI.jsp";//转发才能接收到request
	}
	
	@RequestMapping(value = "/loginUI")
	public String loginUI() {
		return "/WEB-INF/jsp/back/loginUI.jsp";
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
	
	@RequestMapping(value = "/userManager")
	public String userManager(HttpSession session,HttpServletRequest request) {
		List userList = userService.getAll();
		Collections.reverse(userList);
		request.setAttribute("userList", userList);
		
		return "/WEB-INF/jsp/back/userManager.jsp";
	}
	
	@RequestMapping(value = "/adminManager")
	public String adminManager(HttpSession session,HttpServletRequest request) {
		List adminList = adminService.listAll();
		Collections.reverse(adminList);
		request.setAttribute("adminList", adminList);
		return "/WEB-INF/jsp/back/adminManager.jsp";
	}
	
	@RequestMapping(value = "/movManager")
	public String movManager(HttpSession session,HttpServletRequest request) {
		List movList = movService.search("");
		Collections.reverse(movList);
		request.setAttribute("movList", movList);
		return "/WEB-INF/jsp/back/movManager.jsp";
	}
	
	/**
	 * 删除
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request,@RequestParam int id) {
		adminService.delete(id);
		return "redirect:/admin/adminManager.do";
	}
}
