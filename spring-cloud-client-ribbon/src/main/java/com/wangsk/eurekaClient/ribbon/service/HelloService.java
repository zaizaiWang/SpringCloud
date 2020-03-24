package com.wangsk.eurekaClient.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public  String getHi(String msg){
        return  restTemplate.getForObject("http://spring-cloud-service//hiGet?reqStr="+msg,String.class);
    }

}
