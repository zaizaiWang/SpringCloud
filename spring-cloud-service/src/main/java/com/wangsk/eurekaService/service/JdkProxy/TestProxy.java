package com.wangsk.eurekaService.service.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {

        //创建目标类及被代理类
        People tar = new Chianese();

        //创建增强调用类
        InvocationHandler proxy = new PeopleProxy(tar);

        //创建增强类。参数：目标类的类加载器，目标类所实现接口的类模板数组，增强调用类
        People peopleProxy = (People) Proxy.newProxyInstance(tar.getClass().getClassLoader(),tar.getClass().getInterfaces(),proxy);

        peopleProxy.work();
    }
}
