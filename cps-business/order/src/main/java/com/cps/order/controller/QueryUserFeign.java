package com.cps.order.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cps-user")
public interface QueryUserFeign {

    @RequestMapping("/selectUser")
    String QueryUserController();
}
