package com.cl.springboot.controller;

import com.cl.springboot.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*@RestController*/
@Controller
@ResponseBody
@RequestMapping("/user")
public class HelloController {
   //加载属性配置文件中的变量
   /* @Value("${name}")
    private  String name;
    @Value("${age}")
    private  Integer age;

    @Value("${content}")
    private  String content;*/

    @Autowired
    private UserProperties userProperties;
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public  String  say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){

        return  "id:"+id;
      //return  userProperties.getUsername()+","+userProperties.getAge()+","+userProperties.getRealname();
           // return  "index";
    }




    //获取url中的数据
    @RequestMapping(value = "/{id}/hello01",method = RequestMethod.GET)
    //@RequestMapping(value = "/hello01{id}",method = RequestMethod.GET)

    public String saySecond(@PathVariable("id") Integer id){

        return  "id:"+id;
    }
}
