package com.tajok.dao;

import com.tajok.model.Mov;

public interface MovMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mov record);

    int insertSelective(Mov record);

    Mov selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mov record);

    int updateByPrimaryKey(Mov record);
}