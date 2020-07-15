package com.wangsk.eurekaService.service.CglibProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
/**
 * CGlib动态代理 增强类
 */
public class ChinaeseProxy implements MethodInterceptor {


    public Chinaese getChinasesProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Chinaese.class);
        enhancer.setCallback(this);
        return (Chinaese) enhancer.create();
    }

    @Override
    public String intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中国人工作前，指定工作计划");
        methodProxy.invokeSuper(o,objects);
        System.out.println("中国人工作后，检查工作成果");
        return  null;
    }
}
