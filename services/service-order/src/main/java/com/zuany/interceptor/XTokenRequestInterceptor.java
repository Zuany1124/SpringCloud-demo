package com.zuany.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class XTokenRequestInterceptor implements RequestInterceptor {
    /**
     * 请求拦截器
     *
     * @param template 封装本次请求的详细信息
     */
    @Override
    public void apply(RequestTemplate template) {
        System.out.println("XTokenRequestInterceptor ...");
        template.header("X-Token", UUID.randomUUID().toString());
    }
}
