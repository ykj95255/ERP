package com.wowo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wowo.mapper")
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class,args);
    }
}
