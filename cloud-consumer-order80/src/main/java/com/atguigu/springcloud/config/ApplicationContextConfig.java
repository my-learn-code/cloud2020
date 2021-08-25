package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : ApplicationContextConfig
 * @Description :
 * @Author : Starry_sky
 * @Date: 2020-12-22 20:44  //时间
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //配置负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
