package com.wangsk.eurekaService.service.CglibProxy;
/**
 * CGlib动态代理 测试类
 */
public class TestCglibProxy {
    public static void main(String[] args) {

        //增强类
        Chinaese chinaeseProxy = new ChinaeseProxy().getChinasesProxy();

        chinaeseProxy.work();
    }
}
