package com.cps.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/abc")
    public String hello(){
        return "hello  树哥";
    }
}
