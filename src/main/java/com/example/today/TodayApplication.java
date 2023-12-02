package com.example.today;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.today.mapper")
@SpringBootApplication
public class TodayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodayApplication.class, args);
    }

}
