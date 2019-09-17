package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.Complain;

public interface ComplainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Complain record);

    int insertSelective(Complain record);

    Complain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}