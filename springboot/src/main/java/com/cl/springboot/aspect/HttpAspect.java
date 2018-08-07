package com.cl.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * aop
 */
@Aspect
@Component
public class HttpAspect {

  /*  @Before("execution(public *  com.cl.springboot.controller.StudentController.*())")
    public  void  log(){

        System.out.println(1111);
    }

    @After("execution(public *  com.cl.springboot.controller.StudentController.*())")
    public  void doAfter(){
        System.out.println(222);

    }*/

  //日志
private  static  final Logger logger=LoggerFactory.getLogger(HttpAspect.class);

 //定义切入点
  @Pointcut("execution(public *  com.cl.springboot.controller.StudentController.*(..))")
  public  void  log(){}


  @Before("log()")
  public void before(JoinPoint joinPoint){

      ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
      HttpServletRequest request=attributes.getRequest();
     //请求的url
      logger.info("url={}",request.getRequestURL());
     //请求方式
      logger.info("method={}",request.getMethod());
      //ip
      logger.info("ip={}",request.getRemoteAddr());
      //方法
      logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
     //参数
      logger.info("args={}",joinPoint.getArgs());

     // System.out.println(1111);
      //logger.info("1111");
  }
  @After("log()")
  public void after(){
     // System.out.println(2222);
      logger.info("2222");
  }

  @AfterReturning(returning = "object",pointcut = "log()")
  public  void afterReturnning(Object object){
      logger.info("response={}",object);
  }

}




