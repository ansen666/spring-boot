package com.imooc.imoocspringbootstarter.utils;

import lombok.Data;

@Data
public class JsonResult {
    public static int SUCCESS=0;
    public static int Error=-1;

    private int status;
    private String msg;
    private Object data;
    private String ok;

    public static JsonResult build() {
        return new JsonResult();
    }

    public static JsonResult build(int code) {
        return new JsonResult().status(code);
    }

    public static JsonResult build(int code, String msg) {
        return new JsonResult().status(code).msg(msg);
    }

    public static <T> JsonResult build(int code, Object data) {
        return new JsonResult().status(code).data(data);
    }

    public static  JsonResult build(int code, String msg, Object data) {
        return new JsonResult().status(code).msg(msg).data(data);
    }

    public static JsonResult ok() {
        return build(SUCCESS);
    }
//
//    public static JsonResult ok(String msg) {
//        return build(SUCCESS, msg);
//    }
//
    public static JsonResult ok(Object data) {
        return build(SUCCESS, data);
    }
//
//    public static JsonResult err() {
//        return build(EXCEPTION);
//    }
//
    public static JsonResult err(String msg) {
        return build(Error, msg);
    }

    public static JsonResult err(Object msg) {
        return build(Error, msg);
    }

    public JsonResult status(int status) {
        this.status = status;
        return this;
    }

    public JsonResult msg(String msg) {
        this.msg = msg;
        return this;
    }

    public JsonResult data(Object data) {
        this.data = data;
        return this;
    }


}
