package com.wangsk.eurekaService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RabbitProvider {

    private final static Logger log = LoggerFactory.getLogger(RabbitProvider.class);

    @Autowired
    AmqpTemplate amqpTemplate;

    public void  send(){
        String content = "Hello"+new Date();
        log.info("生产者"+content);
        amqpTemplate.convertAndSend("HelloRabbit",content);
    }
}
