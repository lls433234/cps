package com.cps.order.controller;

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
    private QueryUserFeign queryUserFeign;

    @RequestMapping("/businessSelectUser")
    public String selectUser(){
        System.out.println("aaa");
        String s = queryUserFeign.QueryUserController();
        return "调用business模块中的selectUser方法:"+s;
    }
}
