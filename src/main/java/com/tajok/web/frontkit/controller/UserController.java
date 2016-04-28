package com.tajok.web.frontkit.controller;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tajok.web.backend.model.Admin;
import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.model.User;
import com.tajok.web.frontkit.service.IMovService;
import com.tajok.web.frontkit.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;//将本地的userService属性注入，等同且替代了setter
	@Resource
	private IMovService movService;//将本地的userService属性注入，等同且替代了setter
	
	/**
	 * 访客首页
	 * @param request
	 * @return
	 */
	@RequestMapping("/guest")
	public String guest(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/userAction/guest.jsp";
		
	}
	
	/**
	 * 登录首页
	 * @param request
	 * @return
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/userAction/index.jsp";
	}
	
	/**
	 * 用户注册界面
	 * @param request
	 * @return
	 */
	@RequestMapping("/registerUI")
	public String registerUI(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/userAction/registerUI.jsp";
	}
	
	/**
	 * 用户注册
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String register(HttpServletRequest request,@RequestParam String name,@RequestParam int phone,@RequestParam String email,
			@RequestParam int level,@RequestParam String password,@RequestParam String password_c) {
		
		if(userService.registerCheck(email,password,password_c)){
			userService.register(name,phone,level,email,password);
		}
		else{
			request.setAttribute("error", "注册信息错误 或 邮箱已被注册！");
			return "/WEB-INF/jsp/front/userAction/registerUI.jsp";
		}
		
		return "/WEB-INF/jsp/front/userAction/registerSucess.jsp";
	}
	
	/**
	 * 登录
	 * @param request
	 * @param session
	 * @param email
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(HttpServletRequest request,HttpSession session,@RequestParam String email,@RequestParam String password) {//@PathVariable用来动态传参，url更美观
		
		if(userService.loginCheck(email,password))
		{
			User user = userService.getModel(email);
			session.setAttribute("user", user);
			return "redirect:/user/index.do"; //修改数据的时候要重定向
		}else
			request.setAttribute("error", "账号/密码错误！");
		return "/WEB-INF/jsp/front/userAction/guest.jsp"; //转发才能接收到request
	}
	
	/**
	 * 注销
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String loginout(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		User user = (User) session.getAttribute("user"); 
		System.out.println(user!=null?user.getId():"没有session");
		session.removeAttribute("user");
		return "redirect:/user/guest.do"; 
	}
	
	/**
	 * 用户个人信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/info")
	public String info(HttpSession session,HttpServletRequest request) {
		
		session = request.getSession();
		User user = (User) session.getAttribute("user"); 
		List movList = movService.listMov(user.getId());
		Collections.reverse(movList);
		request.setAttribute("movList", movList);
		
		return "/WEB-INF/jsp/front/userAction/info.jsp";
	}
	
	/**
	 * 报错界面
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/error")
	public String error(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/error.jsp";
	}
	
	/**
	 * 删除
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request,@RequestParam int id) {
		userService.delete(id);
		return "redirect:/admin/userManager.do";
	}
	
	/**
	 * 测试
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/test")
	public String test(HttpServletRequest request) {
		
		return "/WEB-INF/jsp/front/movAction/mov.jsp";
	}
	
	
	/*
	@RequestMapping("/showUser/{id}") //带占位符的URL
	public String showUser(HttpServletRequest request,@PathVariable int id,HttpSession session) {//@PathVariable用来动态传参，url更美观
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		
		session.setAttribute("user", user);
		
		return "/WEB-INF/jsp/front/userAction/showUser.jsp";
	}
	
	@RequestMapping("/auditUser/{id}")
	public String auditUser(HttpServletRequest request,@PathVariable int id) {
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		
		HttpSession session = request.getSession();
		User users = (User) session.getAttribute("user"); 
		System.out.println(users!=null?users.getId():"没有session");
		
		
		return "/WEB-INF/jsp/front/userAction/auditUser.jsp";
	}
	*/
	
}
