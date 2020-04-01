package com.jay.springcloundzuul.config;

import com.jay.springcloundzuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jay
 * @description
 * @date 2020/3/27 19:54
 */
@Configuration
public class ZuulConfiguration {
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
