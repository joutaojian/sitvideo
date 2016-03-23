package com.tajok.web.frontkit.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.tajok.web.frontkit.dao.UserMapper;
import com.tajok.web.frontkit.model.User;
import com.tajok.web.frontkit.service.IUserService;

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

	@Override
	public boolean registerCheck(String email, String password, String password_c) {
		
		if(userDao.getByEmail(email) == null && password.equals(password_c) && password != null)
			return true;
		else
			return false;
	}

	@Override
	public void register(String name, int phone, int level, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setPassword(password);
		user.setLevelId(level);
		userDao.insert(user);
		
	}
	

}
