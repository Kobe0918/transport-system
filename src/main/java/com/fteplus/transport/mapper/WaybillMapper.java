package com.fteplus.transport.mapper;

import com.fteplus.transport.entity.Waybill;

public interface WaybillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Waybill record);

    int insertSelective(Waybill record);

    Waybill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Waybill record);

    int updateByPrimaryKey(Waybill record);
}