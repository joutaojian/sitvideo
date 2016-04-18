package com.tajok.web.backend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.tajok.web.backend.dao.AdminMapper;
import com.tajok.web.backend.model.Admin;
import com.tajok.web.backend.service.IAdminService;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	
	@Resource
	private AdminMapper adminDao;

	@Override
	public boolean loginCheck(String email, String password) {
		
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

	@Override
	public List listAll() {
		List adminList = adminDao.listAll();
		return adminList;
	}

	

}
