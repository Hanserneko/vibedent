package com.akira.xsglxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.akira.xsglxt.mapper")
public class XsglxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(XsglxtApplication.class, args);
    }

}
