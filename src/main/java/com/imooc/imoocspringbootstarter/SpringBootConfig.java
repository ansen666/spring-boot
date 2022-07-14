package com.imooc.imoocspringbootstarter;

import com.imooc.imoocspringbootstarter.pojo.Stu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //加上这个注解，表示这是一个配置类
public class SpringBootConfig {
    @Bean //把Bean对象注入容器里面
    public Stu stu(){
        return new Stu("jack",18);
    }
}
