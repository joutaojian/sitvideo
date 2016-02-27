package com.tajok.service;

import com.tajok.model.Admin;

public interface IAdminService {
	
	public boolean loginCheck(String email ,String password);

	public Admin getModel(String email);
	
}
