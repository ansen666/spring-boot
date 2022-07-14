package com.imooc.imoocspringbootstarter.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * 任务工具类
 */
@Configuration //标记配置累，使得spring boot容易可以扫描到
@EnableScheduling //开启定时任务
@Slf4j
public class MyTask {

    //添加一个任务，并且注明任务运行表达式
    @Scheduled(cron = "*/5 * * * * ?")//每隔5秒执行一次
    public void publishMsg(){
        log.warn("开始执行任务:"+ LocalDateTime.now());
    }


}
