package com.wangsk.eurekaZuul.provider;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class WebFeignFallbackProvider implements FallbackProvider {


    @Override
    public String getRoute() {
        return "spring-cloud-client-feign";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                JSONObject responseJson = new JSONObject();
                responseJson.put("status","200");
                responseJson.put("message","无法连接，请检查您的网络");
                return new ByteArrayInputStream(responseJson.toJSONString().getBytes("UTF-8"));
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders hHttpHeaders = new HttpHeaders();
                hHttpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return hHttpHeaders;
            }
        };
    }
}
