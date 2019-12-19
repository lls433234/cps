package com.jiuyao.user.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cps-business")
public interface BusniessFeginClient {

    @RequestMapping("/business")
    String TestController();
}
