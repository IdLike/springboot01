package com.cl.springboot.entity;

/**
 * http请求返回结果类型
 **/
public class Result<T> {

    //错误码
    private  String code;
    //提示信息
    private String  msg;
    //具体内容
    private T  Data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

}
