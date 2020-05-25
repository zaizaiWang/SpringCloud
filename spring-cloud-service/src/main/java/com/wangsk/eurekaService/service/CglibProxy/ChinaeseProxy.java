package com.wangsk.eurekaService.service.CglibProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class ChinaeseProxy implements MethodInterceptor {

    private  Chinaese chinaese;

    public ChinaeseProxy(Chinaese obj){
        chinaese = obj;
    }

    public Chinaese getChinasesProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Chinaese.class);
        enhancer.setCallback(this);
        return (Chinaese) enhancer.create();
    }

    @Override
    public String intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中国人工作前，指定工作计划");
        method.invoke(chinaese,objects);
        System.out.println("中国人工作后，检查工作成果");
        return  null;
    }


}
