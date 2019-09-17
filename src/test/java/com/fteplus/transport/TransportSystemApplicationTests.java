package com.fteplus.transport;

import com.alibaba.druid.pool.DruidDataSource;
import com.fteplus.transport.entity.CustomerInfo;
import com.fteplus.transport.mapper.BillMapper;
import com.fteplus.transport.mapper.CustomerInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransportSystemApplicationTests {

    @Autowired
    private DruidDataSource druidDataSource;

    @Autowired
    private CustomerInfoMapper mapper;
    @Test
    public void contextLoads() throws SQLException {
          druidDataSource.getConnection();
          System.out.println(druidDataSource);
          druidDataSource.close();
    }

    @Test
    public void testInsert(){
        CustomerInfo info = new CustomerInfo();
        info.setAddr("putian");
        info.setEmail("123@qq.com");
        info.setName("lzh");
         mapper.insert(info);
        System.out.println(info.toString());
    }

    @Test
    public void testSelect(){
        CustomerInfo info = mapper.selectByPrimaryKey(1);
        System.out.println(info.toString());
    }

    @Test
    public void testUpdate(){
        CustomerInfo info = new CustomerInfo();
        info.setId(2);
        info.setAddr("putian");
        info.setEmail("123@qq.com");
        info.setName("lzh023");
        mapper.updateByPrimaryKey(info);
    }

    @Test
    public void testDelete(){
        mapper.deleteByPrimaryKey(1);
    }
}
