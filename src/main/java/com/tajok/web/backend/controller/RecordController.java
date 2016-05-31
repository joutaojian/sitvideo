package com.tajok.web.backend.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tajok.web.backend.service.IRecordService;
import com.tajok.web.frontkit.service.IMovService;

@Controller
@RequestMapping("/record")
public class RecordController {

	@Resource
	private IRecordService recordService;//将本地的userService属性注入，等同且替代了setter
	@Resource
	private IMovService movService;//将本地的userService属性注入，等同且替代了setter
	
	@RequestMapping(value = "/rank")
	public String rank(HttpSession session,HttpServletRequest request) {
		
		
		return "/WEB-INF/jsp/back/loginUI.jsp";
	}
	
}
