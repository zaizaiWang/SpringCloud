package com.wangsk.eurekaClient.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "spring-cloud-service")
public interface HelloClient {

    @RequestMapping(value = "/hiGet",method = RequestMethod.GET)
    public String getHi(@RequestParam(value="reqStr") String msg);
}
