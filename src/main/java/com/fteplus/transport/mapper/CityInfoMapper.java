package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.CityInfo;

public interface CityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    CityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);
}