package com.tajok.web.backend.service;

import java.util.List;

import com.tajok.web.backend.model.Admin;

public interface IAdminService {
	
	public boolean loginCheck(String email ,String password);

	public Admin getModel(String email);

	public List listAll();

	public void delete(int id);
	
}
