package com.cps.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/business")
    public String test(){
        return "hello my name is business";
    }
}
