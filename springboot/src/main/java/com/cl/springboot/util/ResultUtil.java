package com.cl.springboot.util;

import com.cl.springboot.entity.Result;

public class ResultUtil {

    //请求成功且有数据返回的result
    public static Result success(Object object){

        Result result=new Result();
        result.setCode("suceess");
        result.setMsg("成功");
        result.setData(object);
        return  result;
    }

    public  static  Result success(){
        Result result=new Result();
        result.setCode("suceess");
        result.setMsg("成功");
        return  result;
    }

    public  static  Result fail(String code,String msg){

        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return  result;

    }
}
