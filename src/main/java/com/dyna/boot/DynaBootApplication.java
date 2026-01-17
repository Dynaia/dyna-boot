package com.dyna.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dyna.boot.**.repository")
@SpringBootApplication
public class DynaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynaBootApplication.class, args);
    }

}
