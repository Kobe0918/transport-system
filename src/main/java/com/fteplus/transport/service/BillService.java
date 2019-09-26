package com.fteplus.transport.service;


import com.fteplus.transport.dto.BillExcution;
import com.fteplus.transport.entity.Bill;

import javax.management.relation.InvalidRelationTypeException;
import java.util.List;

public interface BillService {
     BillExcution insertBill(Bill bill);

     BillExcution selectByPage(Integer pageNo, Integer limit);
}
