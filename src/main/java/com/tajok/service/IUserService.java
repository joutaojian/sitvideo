package com.tajok.service;

import java.util.List;

import com.tajok.model.User;

public interface IUserService {
	public User getUserById(int userId);
	public List<User> getAll();
	public boolean loginCheck(String email ,String password);
	public User getModel(String email);
}
