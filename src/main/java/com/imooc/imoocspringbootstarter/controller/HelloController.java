package com.imooc.imoocspringbootstarter.controller;

import com.imooc.imoocspringbootstarter.utils.JsonResult;
import com.imooc.imoocspringbootstarter.pojo.MyConfig;
import com.imooc.imoocspringbootstarter.pojo.Stu;
import com.imooc.imoocspringbootstarter.pojo.Student;
import com.imooc.imoocspringbootstarter.utils.MyAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

//@Controller
@RestController //相当于@Controller+@ResponseBody
@Slf4j //日志框架
public class HelloController {
    @Autowired
    private Stu stu;
    @Autowired
    private MyConfig myConfig;

    @Autowired
    private MyAsyncTask myAsyncTask;

    @Value("${self.custom.config.sdkSecrect}") //从yml属性文件中获取
    private String sdkSecrect;

    @Value("${self.custom.config.host}")
    private String host;

    @Value("${app.name.xxx.yyy.zzz}")
    private String xyz;

    @Value("${self.custom.config.port}")
    private String port;

    @RequestMapping("hello")
//    @GetMapping("hello") //可以指定get请求方式
//    @ResponseBody
    public String hello(){
        return "Hello World 111~~";
    }

    @GetMapping("getStu")
    public Object getStu(){
        return  stu;
    }

    @GetMapping("getMyConfig")
    public Object getMyConfig(){
        myAsyncTask.publishMsg();
        log.info("这是跳过异步任务的执行");
        return  myConfig;
    }


    @GetMapping("getYmlCustomConfig")
    public Object getYmlCustomConfig(){
        log.info("打印日志");
        return  sdkSecrect+";\t"+host+";\t"+xyz+";\t"+port;
    }

    @GetMapping("getStudent")
    public JsonResult getStudent(){
        Student student=new Student();
        student.setName("Ansen");
        student.setAge(18);
        return  JsonResult.ok(student);
    }

    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        file.transferTo(new File("/Users/anhui/Downloads/temp/"+file.getOriginalFilename()));
        return "上传成功";
    }
}
