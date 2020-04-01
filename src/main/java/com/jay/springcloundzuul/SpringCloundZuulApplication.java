package com.jay.springcloundzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

//zuul自带负载均衡，当某个客户端是多节点时是自动路由的
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloundZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundZuulApplication.class, args);
    }

}
