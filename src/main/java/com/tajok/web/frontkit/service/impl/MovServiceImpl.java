package com.tajok.web.frontkit.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tajok.web.frontkit.dao.MovMapper;
import com.tajok.web.frontkit.dao.UserMapper;
import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.model.User;
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

	@Override
	public Mov show(int id) {
		Mov mov = movDao.show(id);
		return mov;
	}
	
	@Override
	public Boolean upload(String name, String descp, String[] paths,User user,int levelId) {
		Mov mov = new Mov();
		mov.setDescp(descp);
		mov.setName(name);
		mov.setUserId(user.getId());
		mov.setLevelId(levelId);
		mov.setTime(new Date());
		mov.setImgUrl(paths[0]);
		mov.setResUrl(paths[1]);
		mov.setMovUrl(paths[2]);
		movDao.insert(mov);
		System.out.println("---yes---"+name+descp+paths[1]);
		return null;
	}

	@Override
	public List listMov(Integer id) {
		
		List movList = movDao.listMy(id);
		return movList;
	}

	@Override
	public void deleteMov(int id) {
		movDao.deleteByPrimaryKey(id);
	}

	
	
}
