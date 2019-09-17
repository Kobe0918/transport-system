package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.CustomerReceipt;

public interface CustomerReceiptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerReceipt record);

    int insertSelective(CustomerReceipt record);

    CustomerReceipt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerReceipt record);

    int updateByPrimaryKey(CustomerReceipt record);
}