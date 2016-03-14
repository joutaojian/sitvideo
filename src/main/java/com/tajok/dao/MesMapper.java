package com.tajok.dao;

import com.tajok.model.Mes;

public interface MesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mes record);

    int insertSelective(Mes record);

    Mes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mes record);

    int updateByPrimaryKey(Mes record);
}