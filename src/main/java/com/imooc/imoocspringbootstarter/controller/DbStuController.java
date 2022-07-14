package com.imooc.imoocspringbootstarter.controller;

import com.imooc.imoocspringbootstarter.pojo.DbStu;
import com.imooc.imoocspringbootstarter.service.StuService;
import com.imooc.imoocspringbootstarter.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

//@Controller
@RestController //相当于@Controller+@ResponseBody
@Slf4j //日志框架
@RequestMapping("dbstu")
public class DbStuController {
    @Autowired
    private StuService stuService;

    @GetMapping("{stuId}/get")
    public String get(@PathVariable("stuId") String stuId,int id,String name){
        log.info("stuId:"+stuId+" id:"+id+" name:"+name);
        return "查询Stu";
    }

    @PostMapping("create")
    public JsonResult createStu(){
        DbStu dbStu=new DbStu();
        String id = UUID.randomUUID().toString();
        dbStu.setId(id);
        dbStu.setName("Ansen");
        dbStu.setSex(1);

        stuService.saveStu(dbStu);
        return JsonResult.ok();
    }

//    @Valid 对请求数据做校验
    @PostMapping("createStuTwo")
    public JsonResult createStuTwo(@Valid @RequestBody DbStu stu, BindingResult result){

        //判断BindingResult是否有错误，错误信息是否包含在里面，如果有错直接resutl
        if(result.hasErrors()){
            Map<String,String> map=getErrors(result);
            return JsonResult.err(map);
        }

        String id = UUID.randomUUID().toString();
        stu.setId(id);

        stuService.saveStu(stu);
        return JsonResult.ok();
    }

    @GetMapping("/get")
    public JsonResult get(String stuId) {
        DbStu stu=stuService.queryById(stuId);

        List<DbStu> list= stuService.queryByCondition("Ansen",1);
        log.info("size:"+list.size());
        return JsonResult.ok(stu);
    }

    @GetMapping("/testTrans")
    public JsonResult testTrans(){
        stuService.testTrans();
        return JsonResult.ok();
    }

    public Map<String,String> getErrors(BindingResult result){
        Map<String,String> map=new HashMap<>();
        for(FieldError error:result.getFieldErrors()){
            String filed=error.getField();
            String msg=error.getDefaultMessage();
            map.put(filed,msg);
        }
        return map;
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
