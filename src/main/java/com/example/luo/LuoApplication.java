package com.example.luo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.luo.*.mapper")
public class LuoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuoApplication.class, args);
    }


}
