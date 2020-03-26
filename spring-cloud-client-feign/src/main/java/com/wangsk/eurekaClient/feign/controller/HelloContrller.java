package com.wangsk.eurekaClient.feign.controller;

import com.wangsk.eurekaClient.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrller {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/getHi",method = RequestMethod.GET)
    public String hetHi(String msg){
        return helloService.getHi(msg);
    }
}
