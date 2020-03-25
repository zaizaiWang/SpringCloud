package com.wangsk.eurekaClient.feign.fallback;

import com.wangsk.eurekaClient.feign.interfaces.HelloClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements FallbackFactory<HelloClient> {
    @Override
    public HelloClient create(Throwable cause) {
        return new IHelloClient() {
            @Override
            public String getHi(String msg) {
                return "抱歉---"+msg+"，您请求的服务不存在了";
            }
        };
    }
}
