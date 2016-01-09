package com.tajok.service;

import java.util.List;

import com.tajok.model.User;

public interface IUserService {
	public User getUserById(int userId);
	public List<User> getAll();
}
