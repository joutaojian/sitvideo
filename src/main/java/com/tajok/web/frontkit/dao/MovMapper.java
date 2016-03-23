package com.tajok.web.frontkit.dao;

import java.util.List;
import com.tajok.web.frontkit.model.Mov;

public interface MovMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mov record);

    int insertSelective(Mov record);

    Mov selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mov record);

    int updateByPrimaryKey(Mov record);
    
    //手动

	List<Mov> search(String content);
}