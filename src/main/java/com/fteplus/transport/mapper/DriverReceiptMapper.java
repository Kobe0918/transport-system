package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.DriverReceipt;

public interface DriverReceiptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverReceipt record);

    int insertSelective(DriverReceipt record);

    DriverReceipt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverReceipt record);

    int updateByPrimaryKey(DriverReceipt record);
}