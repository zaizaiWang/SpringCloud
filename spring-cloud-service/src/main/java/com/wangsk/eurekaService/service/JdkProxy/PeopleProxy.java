package com.wangsk.eurekaService.service.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理增强调用类
 */
public class PeopleProxy implements InvocationHandler {

    private People people;

    public PeopleProxy(People obj){
        people = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("中国人工作前，指定工作计划");
        method.invoke(people,args);
        System.out.println("中国人工作后，检查工作成果");
        return null;
    }
}
