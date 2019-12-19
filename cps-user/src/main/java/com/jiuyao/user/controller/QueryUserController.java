package com.jiuyao.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@EnableFeignClients
public class QueryUserController {

    @Autowired
    private BusniessFeginClient busniessFeginClient;

    @RequestMapping("/queryUser")
    public String queryUser(){
        System.out.println("aaa");
        String s = busniessFeginClient.TestController();
        return "访问user模块中的接口后返回的business模块中的信息:"+s;
    }

    @RequestMapping("/test")
    public String test(){
        return "user模块中的test接口";
    }


    @RequestMapping("/selectUser")
    public String selectUser(){
        System.out.println("user模块中的selectUser方法被调用");
        return "user模块中的selectUser方法被调用";
    }
}
