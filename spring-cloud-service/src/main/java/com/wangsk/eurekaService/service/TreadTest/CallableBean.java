package com.wangsk.eurekaService.service.TreadTest;

import java.util.concurrent.Callable;

public class CallableBean implements Callable {

    private String name;

    CallableBean(String name){
        this.name = name;
    }

    @Override
    public Object call() throws Exception {

            Thread.sleep(500);


        return name+"执行完了";
    }
}
