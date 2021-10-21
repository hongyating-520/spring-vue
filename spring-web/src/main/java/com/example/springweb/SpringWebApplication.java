package com.example.springweb;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example","com.test"})
@MapperScan("com.test.mapper")
public class SpringWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

}
