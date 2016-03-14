package com.tajok.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
	
	@Override
	public boolean loginCheck(String email, String password) {
		
		User user = userDao.getByEmail(email);
		
		if (user!=null && password.equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public User getModel(String email) {
		User user = userDao.getByEmail(email);
		return user;
	}
	

}
