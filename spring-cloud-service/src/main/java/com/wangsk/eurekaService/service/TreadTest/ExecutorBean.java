package com.wangsk.eurekaService.service.TreadTest;

import java.util.concurrent.Semaphore;

public class ExecutorBean implements  Runnable{

    private  String name ;

    ExecutorBean(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+name+"执行了！");

        }

}
