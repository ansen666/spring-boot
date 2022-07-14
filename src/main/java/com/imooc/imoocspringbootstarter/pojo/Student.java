package com.imooc.imoocspringbootstarter.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //生成get和set方法
@ToString //生成toString方法
@NoArgsConstructor //生成默认构造函数
@AllArgsConstructor //生成全参数构造函数
public class Student {
    private String name;
    private int age;
}
