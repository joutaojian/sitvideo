package com.tajok.web.frontkit.service;

import java.util.List;
import com.tajok.web.frontkit.model.User;

public interface IUserService {
	public User getUserById(int userId);
	public List<User> getAll();
	public boolean loginCheck(String email ,String password);
	public User getModel(String email);
	public boolean registerCheck(String email, String password, String password_c);
	public void register(String name, int phone, int level, String email, String password);
	public void delete(int id);
}
