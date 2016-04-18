package com.tajok.web.frontkit.service;

import java.util.List;

import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.model.User;

public interface IMovService {

	List<Mov> search(String content);

	Mov show(int id);

	Boolean upload(String name, String descp, String[] paths, User user, int levelId);

	List listMov(Integer id);

	void deleteMov(int id);

}
