package com.imooc.imoocspringbootstarter.test;

import com.imooc.imoocspringbootstarter.pojo.DbStu;
import com.imooc.imoocspringbootstarter.service.StuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest //表示当前会被spring boot加载，加载为测试类
public class MyTest {
    @Autowired
    private StuService stuService;

    @Test
    public void testSaveStu(){
        DbStu dbStu=new DbStu();
        String id = UUID.randomUUID().toString();
        dbStu.setId(id);
        dbStu.setName("Ansengfdgfd");
        dbStu.setSex(1);
        stuService.saveStu(dbStu);
    }
}
