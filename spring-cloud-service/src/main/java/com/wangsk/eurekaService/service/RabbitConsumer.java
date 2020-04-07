package com.wangsk.eurekaService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "HelloRabbit")  //也可加在方法上
public class RabbitConsumer {

    private final static Logger log = LoggerFactory.getLogger(RabbitConsumer.class);
    @RabbitHandler
    public void process(String content){
        log.info("消费者"+content);
    }
}
