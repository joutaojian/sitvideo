package com.tajok.web.frontkit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.service.IMovService;
import com.tajok.web.frontkit.service.IUserService;

@Controller
@RequestMapping("/mov")
public class MovController {
	
	@Resource
	private IMovService movService;//将本地的userService属性注入，等同且替代了setter
	
	/**
	 * 观看视频
	 * 转发
	 * @param content
	 * @return
	 */
	@RequestMapping("/show")
	public String look(HttpServletRequest request){
		return "/WEB-INF/jsp/front/movAction/mov.jsp";
	}
	
	/**
	 * 搜索视频
	 * 转发
	 * @param content
	 * @return
	 */
	@RequestMapping("/search")
	public String search(HttpServletRequest request,@RequestParam String content){
		
		List<Mov> movList = movService.search(content);
		
		return "/WEB-INF/jsp/front/movAction/search2.jsp";
		
	}
	
	/**
	 * 上传视频
	 * 重定向
	 * @return
	 */
	public String addMov(HttpServletRequest request,@RequestParam String name,String desc){
		return null;
		
	}
	
	/**
	 * 删除视频
	 * 重定向
	 * @return
	 */
	public String deleteMov(){
		return null;
		
	}
	
	/**
	 * 修改视频界面
	 * 转发
	 */
	public String auditMovUI(){
		return null;
		
	}
	
	/**
	 * 修改视频信息
	 * 重定向
	 */
	public String auditMov(){
		return null;
		
	}
	
}
