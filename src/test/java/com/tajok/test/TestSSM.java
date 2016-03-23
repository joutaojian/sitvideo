package com.tajok.test;

import java.util.List;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.model.User;
import com.tajok.web.frontkit.service.IMovService;
import com.tajok.web.frontkit.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestSSM {
	
	private static Logger logger = Logger.getLogger(TestSSM.class);
	
	@Resource
	private IUserService userService; 
	@Resource
	private IMovService movService;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info("test1:"+JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd"));
	}
	
	@Test
	public void test2() {
		List<User> users = userService.getAll();
		logger.info("test2:"+JSON.toJSONStringWithDateFormat(users, "yyyy-MM-dd"));
	}
	
	@Test
	public void test3() {
		List<Mov> movs = movService.search("你");
		logger.info("test3:"+movs.get(0).getName());
	}
	
}
