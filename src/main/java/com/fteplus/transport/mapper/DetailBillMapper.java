package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.DetailBill;

public interface DetailBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailBill record);

    int insertSelective(DetailBill record);

    DetailBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailBill record);

    int updateByPrimaryKey(DetailBill record);
}