package com.fteplus.transport.controller;

import com.fteplus.transport.entity.CustomerInfo;
import com.fteplus.transport.mapper.CustomerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CustomerInfoController {
    @Autowired
    private CustomerInfoMapper mapper;

    @GetMapping("/customer/{id}")
    public String  customer(@PathVariable("id")Integer id, Model model){
        CustomerInfo info= mapper.selectByPrimaryKey(id);
        model.addAttribute("info",info);
        return "customer";
    }
}
