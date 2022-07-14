package com.imooc.imoocspringbootstarter.service;

import com.imooc.imoocspringbootstarter.pojo.DbStu;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StuService {
    /**
     * 新增stu到数据库
     * @param stu
     */
    void saveStu(DbStu stu);

    DbStu queryById(String id);

    /**
     * 根据条件查询
     * @param name
     * @param sex
     * @return
     */
    List<DbStu> queryByCondition(String name,int sex) ;

    /**
     * 用于演示事务
     */
    void testTrans();
}
