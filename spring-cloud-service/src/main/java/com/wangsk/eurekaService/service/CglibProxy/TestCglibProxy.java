package com.wangsk.eurekaService.service.CglibProxy;

public class TestCglibProxy {
    public static void main(String[] args) {
        Chinaese chinaese = new Chinaese();

        Chinaese chinaeseProxy = new ChinaeseProxy(chinaese).getChinasesProxy();

        chinaeseProxy.work();
    }
}
