package com.tajok.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tajok.dao.AdminMapper;
import com.tajok.model.Admin;
import com.tajok.service.IAdminService;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	
	@Resource
	private AdminMapper adminDao;

	@Override
	public boolean login(String email, String password) {
		
		Admin admin = adminDao.getByEmail(email);
		
		if (admin!=null && password.equals(admin.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public Admin getModel(String email) {
		Admin admin = adminDao.getByEmail(email);
		return admin;
	}

}
