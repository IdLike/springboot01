package com.cl.springboot.handle;

import com.cl.springboot.entity.Result;
import com.cl.springboot.exception.StudentException;
import com.cl.springboot.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {

    private  static  final Logger logger=LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if(e instanceof StudentException){

            StudentException  studentException=(StudentException)e;

            return  ResultUtil.fail(studentException.getCode(),studentException.getMessage());
        }

        logger.error(e.getMessage());
       return ResultUtil.fail("error","未知错误");

    }

}
