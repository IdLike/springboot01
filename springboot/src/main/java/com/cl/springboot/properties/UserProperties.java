package com.cl.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 属性配置文件中的组
 * 必须要使用@Conponent注解，否则创建不了bean对象
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    private  String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    private Integer age;
    private  String realname;

}
