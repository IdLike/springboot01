package com.cl.springboot.enums;

/**
 * Result中code和msg
 */
public enum ResultEnum {

    UNKNOW_ERROR("-1","未知错误"),
    SUCCESS("0","成功"),
    GOOD("80","这次考试考的不错哦"),
    COMEON("60","继续加油吧"),
    ;
    private  String code;
    private  String  msg;
    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
     ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
