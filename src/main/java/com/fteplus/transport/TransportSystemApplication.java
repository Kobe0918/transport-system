package com.fteplus.transport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.fteplus.transport.mapper")
@SpringBootApplication
public class TransportSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransportSystemApplication.class, args);
    }

}
