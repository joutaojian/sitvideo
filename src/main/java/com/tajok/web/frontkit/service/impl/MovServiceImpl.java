package com.tajok.web.frontkit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tajok.web.frontkit.dao.MovMapper;
import com.tajok.web.frontkit.dao.UserMapper;
import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.service.IMovService;

@Service("movService")
public class MovServiceImpl implements IMovService{


	@Resource
	private MovMapper movDao;
	
	@Override
	public List<Mov> search(String content) {
		
		List<Mov> movList= movDao.search(content);
		
		return movList;
	}

}
