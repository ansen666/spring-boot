package com.imooc.imoocspringbootstarter.exception;

import com.imooc.imoocspringbootstarter.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常拦截
 * 可以针对异常自定义去处理捕获，返回指定的类型（json类型）到前端
 */
@ControllerAdvice
@Slf4j
public class GraceExceptionHandler {

    @ExceptionHandler(FileSizeLimitExceededException.class)
    @ResponseBody
    public JsonResult returnMaxFileSizeLimit(FileSizeLimitExceededException e){
        return JsonResult.err("文件大小不能超过500KB");
    }

    @ExceptionHandler(MyCustiomException.class)
    @ResponseBody
    public JsonResult returnMyCustiomException(MyCustiomException e){
        return JsonResult.err(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult allException(Exception e){
        e.printStackTrace();
        log.info(e.getMessage());
        return JsonResult.err("程序出现异常，请联系客服");
    }
}
