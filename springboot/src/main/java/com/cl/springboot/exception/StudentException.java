package com.cl.springboot.exception;

import com.cl.springboot.enums.ResultEnum;

/**
 * 自定义异常
 */
public class StudentException extends  RuntimeException{

    private  String  code;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public  StudentException(){}
    public  StudentException(String code,String message){

        super(message);
        this.code=code;
    }
    public  StudentException(ResultEnum resultEnum){

        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }

}
