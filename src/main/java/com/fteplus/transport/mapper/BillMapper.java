package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.Bill;

import java.util.List;
import java.util.Map;

public interface BillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    void insertBillAndBillDetail(Map<String,Object> map);

    List<Bill> selectAll();
}