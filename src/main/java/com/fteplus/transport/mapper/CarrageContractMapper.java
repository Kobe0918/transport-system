package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.CarrageContract;

public interface CarrageContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarrageContract record);

    int insertSelective(CarrageContract record);

    CarrageContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarrageContract record);

    int updateByPrimaryKey(CarrageContract record);
}