package com.wangsk.eurekaService.service.JdkProxy;

/**
 * JDK动态代理目标类
 */
public class Chianese implements People {
    private ThreadLocal<String> orderId =  new ThreadLocal<String>();

    @Override
    public String work() {
        System.out.println("中国人努力工作！！！");
        return null;
    }
}
