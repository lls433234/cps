package com.cps.order.controller;

import com.cps.order.entity.Orderd;
import com.cps.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("/abc")
    public String hello(){
        Orderd orderd = new Orderd();
        orderd.setId(1);
        orderd.setName("电影票");
        orderd.setType("娱乐");
        int save = orderMapper.save(orderd);
        System.out.println("次数："+save);
        return "hello  树哥";
    }
}
