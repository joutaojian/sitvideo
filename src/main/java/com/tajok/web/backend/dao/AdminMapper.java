package com.tajok.web.backend.dao;

import java.util.List;

import com.tajok.web.backend.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    
    //手动编写
    Admin getByEmail(String email);

	List listAll();
}