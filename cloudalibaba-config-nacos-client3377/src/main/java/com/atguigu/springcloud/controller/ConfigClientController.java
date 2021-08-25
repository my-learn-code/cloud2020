package com.atguigu.springcloud.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ConfigClientController
 * @Description :
 * @Author : Starry_sky
 * @Date: 2021-01-04 20:09  //时间
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

        @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
