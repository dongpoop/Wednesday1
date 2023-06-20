package com.example.wednesday1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.wednesday1.mapper")
public class Wednesday1Application {

    public static void main(String[] args) {
        SpringApplication.run(Wednesday1Application.class, args);
    }

}
