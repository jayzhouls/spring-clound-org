package com.jay.springcloundzuul.rest;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay
 * @description
 * @date 2020/3/29 14:01
 */
@RestController
//config刷新 会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
//#POST 请求的方式来访问服务端 http://localhost:port/actuator/refresh 就会更新配置文件至最新版本   这是针对单个客户端的刷新机制
@RefreshScope
@RequestMapping("/webApi/test")
public class TestController {
    @Value("${eureka.client.registry-fetch-interval-seconds}")
    private int intervalSeconds;
    @Value("${spring.rabbitmq.host}")
    private String host;
    @Value("${info}")
    private String info;
    @Value("${server.port}")
    private String port;
    @GetMapping("/w0001")
    public JSONObject testFeign(@RequestParam(name = "id") String id) {
        JSONObject result = new JSONObject();
        result.put("intervalSeconds",intervalSeconds);
        result.put("info",info);
        result.put("host",host);
        result.put("port",port);
        return result;
    }
}
