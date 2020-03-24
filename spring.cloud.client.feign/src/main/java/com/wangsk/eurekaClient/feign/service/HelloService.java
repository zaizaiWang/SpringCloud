package com.wangsk.eurekaClient.feign.service;

import com.wangsk.eurekaClient.feign.interfaces.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloClient helloClient;

    public  String getHi(String msg){
        return helloClient.getHi(msg);
    }
}
