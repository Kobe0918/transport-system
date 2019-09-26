package com.fteplus.transport.BillTest;

import com.fteplus.transport.TransportSystemApplicationTests;
import com.fteplus.transport.dto.BillInfoDto;
import com.fteplus.transport.entity.Bill;
import com.fteplus.transport.exception.bill.BillException;
import com.fteplus.transport.service.BillService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class BillTest extends TransportSystemApplicationTests {

    @Autowired
    private BillService billService;

    @Test
    public void testInsertBill(){


        long begin_time = System.currentTimeMillis();
        try{
//            billInfoDto = billService.insertBill(new Bill(300000, 316710, "lzh", "18430", "liuyj", "897844", "pt", new Date(), "huoyundan", new Date()));
        }catch(BillException e){
            System.out.println(e.getMessage());
        }
        long end_time = System.currentTimeMillis();
        long l = end_time - begin_time;
        System.out.println("总共时长 ： " + l);

//2826
    }

    @Test
    public void testProcedure(){
        long begin_time = System.currentTimeMillis();
        billService.insertBill(new Bill(300000, 316710, "lzh", "18430", "liuyj", "897844", "pt", new Date(), "huoyundan", new Date()));
        long end_time = System.currentTimeMillis();
        long l = end_time - begin_time;
        System.out.println(l + " : 总时长2");
    }
}
