package com.imooc.imoocspringbootstarter.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 任务工具类
 */
@Component //标记配置累，使得spring boot容易可以扫描到
@EnableAsync //异步任务
@Slf4j
public class MyAsyncTask {
    @Async
    public void publishMsg(){
        try {
            Thread.sleep(5000);
            log.warn("异步任务处理完毕:"+ LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
