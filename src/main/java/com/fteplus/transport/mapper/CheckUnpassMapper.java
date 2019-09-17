package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.CheckUnpass;

public interface CheckUnpassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckUnpass record);

    int insertSelective(CheckUnpass record);

    CheckUnpass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckUnpass record);

    int updateByPrimaryKey(CheckUnpass record);
}