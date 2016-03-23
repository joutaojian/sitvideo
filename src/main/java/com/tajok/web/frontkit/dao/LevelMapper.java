package com.tajok.web.frontkit.dao;

import com.tajok.web.frontkit.model.Level;

public interface LevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
}