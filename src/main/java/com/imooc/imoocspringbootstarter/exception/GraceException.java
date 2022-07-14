package com.imooc.imoocspringbootstarter.exception;

/**
 * 优雅的处理异常调用
 */
public class GraceException {
    public static void display(String errMsg){
        throw new MyCustiomException(errMsg);
    }


}
