package com.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@EnableDiscoveryClient
public class HelloController {
    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String hello() {
        return  "hello word";
    }

}
