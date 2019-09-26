package com.fteplus.transport.controller;

import com.fteplus.transport.dto.BillExcution;
import com.fteplus.transport.dto.BillResult;
import com.fteplus.transport.entity.Bill;
import com.fteplus.transport.service.impl.BillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BillContorller {

    @Autowired
    private BillServiceImpl billService;


    @PostMapping("/bill")
    public BillResult addBill(Bill bill){
          BillExcution billExcution =  billService.insertBill(bill);
          return new BillResult(true, billExcution);
    }


    @GetMapping("/bills")
    public BillResult selectByPage(@RequestParam(required = false, value = "pageNo", defaultValue = "1")Integer pageNo,
                             @RequestParam(required = false, value = "limit", defaultValue = "10")Integer limit,
                             @RequestParam(required = false, value = "submitDate")String submitDate){
                    return new BillResult(true,billService.selectByPage(pageNo,limit));
    }


}
