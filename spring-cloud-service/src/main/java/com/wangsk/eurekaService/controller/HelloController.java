package com.wangsk.eurekaService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/hiGet",method = RequestMethod.GET)
    public  String getHi(@RequestParam String reqStr){
        log.info("您的入参是{}",reqStr);
        String rspStr = "您输入的是"+reqStr+",您请求服务的端口号是"+port;
        return rspStr;
    }
}
