package com.imooc.imoocspringbootstarter.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.imooc.imoocspringbootstarter.dao.DbStuMapper;
import com.imooc.imoocspringbootstarter.pojo.DbStu;
import com.imooc.imoocspringbootstarter.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private DbStuMapper stuMapper;

    @Override
    public void saveStu(DbStu stu) {
        stuMapper.insert(stu);
    }

    @Override
    public DbStu queryById(String id) {
        DbStu stu=stuMapper.selectById(id);
        return stu;
    }

    @Override
    public List<DbStu> queryByCondition(String name, int sex) {
//        Example example=new Example(DbStu.class);
//        Example.Criteria criteria=example.createCriteria();
//        criteria.andEqualTo("name",name);
//        criteria.andEqualTo("sex",sex);
//        List<DbStu> list=stuMapper.selectByExample(example);

        List<DbStu> list=stuMapper.selectList(Wrappers.<DbStu>lambdaQuery().eq(DbStu::getName,name)
                .eq(DbStu::getSex,sex));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Transactional(propagation = Propagation.REQUIRED) //给方法增加事务管理，保证数据的一致性
    @Override
    public void testTrans() {
        DbStu dbStu=new DbStu();
        dbStu.setId(UUID.randomUUID().toString());
        dbStu.setName("测试事务");
        dbStu.setSex(1);
        stuMapper.insert(dbStu);

        int a = 100/0;

        DbStu dbStuUpdate=new DbStu();
        dbStuUpdate.setId("1001");
        dbStuUpdate.setName("1001修改");
        dbStuUpdate.setSex(2);
        stuMapper.updateById(dbStuUpdate);
    }
}
