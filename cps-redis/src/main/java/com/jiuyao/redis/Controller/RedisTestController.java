package com.jiuyao.redis.Controller;

import com.jiuyao.redis.Utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lls
 * @version 1.0
 * @date 2019/12/25 16:53
 */
@RestController
public class RedisTestController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/redis")
    public String test(){
//        RedisUtil redisUtil = new RedisUtil();
        boolean set = redisUtil.set("name", "zhangsan");
        System.out.println(set);
        String name = redisUtil.get("name").toString();
        System.out.println(name);
        return name;
    }
}
