package com.jiuyao.cpseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CpsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpsEurekaApplication.class, args);
    }

}
