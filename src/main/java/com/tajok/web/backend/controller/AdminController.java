package com.tajok.web.backend.controller;


import java.util.ArrayList;
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
import com.tajok.web.backend.service.IRecordService;
import com.tajok.web.frontkit.controller.UserController;
import com.tajok.web.frontkit.model.Mov;
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
	@Resource
	private IRecordService recordService;//将本地的userService属性注入，等同且替代了setter
	
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
		Mov mov = (Mov) movList.get(0);
		System.out.println(mov.getLevelId());
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
	
	
	@RequestMapping(value = "/shouyeManager")
	public String shouye(HttpServletRequest request) {
		//1
		List<Mov> movRankLists1 = new ArrayList<>();
		List ranks1 = recordService.rank(1);
		for(int i = 0;i<ranks1.size();i++){
			Mov mov = movService.getById(Integer.parseInt((String) ranks1.get(i)));
			System.out.println(mov);
			movRankLists1.add(mov);
		}
		request.setAttribute("movRankLists1", movRankLists1);
		
		//2
		List<Mov> movRankLists2 = new ArrayList<>();
		List ranks2 = recordService.rank(2);
		for(int i = 0;i<ranks2.size();i++){
			Mov mov = movService.getById(Integer.parseInt((String) ranks2.get(i)));
			System.out.println(mov);
			movRankLists2.add(mov);
		}
		request.setAttribute("movRankLists2", movRankLists2);
		
		//3
		List<Mov> movRankLists3 = new ArrayList<>();
		List ranks3 = recordService.rank(3);
		for(int i = 0;i<ranks3.size();i++){
			Mov mov = movService.getById(Integer.parseInt((String) ranks3.get(i)));
			System.out.println(mov);
			movRankLists3.add(mov);
		}
		request.setAttribute("movRankLists3", movRankLists3);
		
		//4
		List<Mov> movRankLists4 = new ArrayList<>();
		List ranks4 = recordService.rank(4);
		for(int i = 0;i<ranks4.size();i++){
			Mov mov = movService.getById(Integer.parseInt((String) ranks4.get(i)));
			System.out.println(mov);
			movRankLists4.add(mov);
		}
		request.setAttribute("movRankLists4", movRankLists4);
		return "/WEB-INF/jsp/back/shouyeManager.jsp";
	}
}
