package com.imooc.imoocspringbootstarter.exception;

/**
 * 自定义异常
 * 目的：
 * 统一处理异常信息，便于解偶，可以在拦截器，控制层，业务层去使用。
 */
public class MyCustiomException extends RuntimeException{

    public MyCustiomException(String errorMsg){
        super(errorMsg);
    }

}
