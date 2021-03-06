package com.wangsk.eurekaClient.ribbon.controller;

import com.wangsk.eurekaClient.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/getHi",method = RequestMethod.GET)
    public String getHi(String msg){
        return helloService.getHi(msg);
    }

}
