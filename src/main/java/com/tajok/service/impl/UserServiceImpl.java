package com.tajok.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.tajok.dao.UserMapper;
import com.tajok.model.User;
import com.tajok.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userDao;
	
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	
	}
	

}
