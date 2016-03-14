package com.tajok.dao;

import java.util.List;

import com.tajok.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //手动编写 
    List<User> getAll();
    User getByEmail(String email);
}