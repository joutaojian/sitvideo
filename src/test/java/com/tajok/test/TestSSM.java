package com.tajok.test;

import java.util.List;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.tajok.web.backend.service.IRecordService;
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
	@Resource
	private IRecordService recordService;

	/**
	 * 查询用户
	 */
	@Test
	public void test1() {
		User user = userService.getUserById(22);
		logger.info("test1:"+JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd"));
	}
	
	/**
	 * 查询所有用户
	 */
	@Test
	public void test2() {
		List<User> users = userService.getAll();
		logger.info("test2:"+users);
	}
	
	/**
	 * 根据关键字查询视频
	 */
	@Test
	public void test3() {
		List<Mov> movs = movService.search("");
		logger.info("test3:"+movs.get(0).getName());
	}
	
	/**
	 * 根据关键字查询视频
	 */
	@Test
	public void test4() {
		List<Mov> mov = movService.search("");
		logger.info("test4:"+JSON.toJSONStringWithDateFormat(mov, "yyyy-MM-dd"));
	}
	
	/**
	 * 查看某个视频
	 */
	@Test
	public void test5() {
		List movList = movService.listMov(6);
		logger.info("test4:"+JSON.toJSONStringWithDateFormat(movList, "yyyy-MM-dd"));
	}
	
	/**
	 * 查看某个视频
	 */
	@Test
	public void test6() {
		List ranks4 = recordService.rank(4);
		logger.info("test6:"+JSON.toJSONStringWithDateFormat(ranks4, "yyyy-MM-dd"));
	}
}
