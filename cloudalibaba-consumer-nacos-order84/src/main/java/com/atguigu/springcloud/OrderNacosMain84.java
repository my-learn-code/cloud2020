package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : OrderNacosMain84
 * @Description :
 * @Author : Starry_sky
 * @Date: 2021-01-26 13:31  //时间
 */


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients

public class OrderNacosMain84
{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
