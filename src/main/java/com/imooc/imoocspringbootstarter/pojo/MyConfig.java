package com.imooc.imoocspringbootstarter.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//使用属性资源文件配置
@Data
@Component //把本配置放入到spring容器中，使其被扫描到
@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:MyConfig.properties" , encoding="utf-8")
public class MyConfig {
    private String name;
    private int age;
    private String sex;
}
