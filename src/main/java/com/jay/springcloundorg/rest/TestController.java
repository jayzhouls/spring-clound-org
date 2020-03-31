package com.jay.springcloundorg.rest;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
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
