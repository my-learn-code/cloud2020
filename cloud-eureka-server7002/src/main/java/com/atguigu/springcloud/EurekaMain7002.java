package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : EurekaMain7001
 * @Description :
 * @Author : Starry_sky
 * @Date: 2020-12-23 09:16  //时间
 */
@SpringBootApplication
//设置当前为Eureka服务端
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
