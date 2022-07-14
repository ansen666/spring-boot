package com.imooc.imoocspringbootstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.imooc.imoocspringbootstarter.dao") //扫描dao接口
@SpringBootApplication
public class StarterApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }

    // 按照下面的方式重写
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StarterApplication.class);
    }
}
