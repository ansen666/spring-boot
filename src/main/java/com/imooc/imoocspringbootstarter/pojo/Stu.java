package com.imooc.imoocspringbootstarter.pojo;

import lombok.Data;

@Data
public class Stu {
    private String id;
    private String name;
    private int age;

    public Stu(){

    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
