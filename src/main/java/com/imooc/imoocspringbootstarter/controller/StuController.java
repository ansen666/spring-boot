package com.imooc.imoocspringbootstarter.controller;

import com.imooc.imoocspringbootstarter.pojo.MyConfig;
import com.imooc.imoocspringbootstarter.pojo.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController //相当于@Controller+@ResponseBody
@Slf4j //日志框架
@RequestMapping("stu")
public class StuController {
    @GetMapping("{stuId}/get")
    public String get(@PathVariable("stuId") String stuId,int id,String name){
        log.info("stuId:"+stuId+" id:"+id+" name:"+name);
        return "查询Stu";
    }

    @PostMapping("create")
    public String createStu(){
        return "新增Stu";
    }

    @PutMapping("update")
    public String updateStu(){
        return "更新Stu";
    }

    @DeleteMapping("delete")
    public String deleteStu(){
        return "删除Stu";
    }


}
