package com.imooc.imoocspringbootstarter.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@TableName("db_stu")
public class DbStu{
    @TableId(value = "id")
    private String id;
    @NotBlank //不为空
    private String name;
    @NotNull //不能为空
    private Integer sex;//必须要使用Integer类型，不能使用int类型
}
