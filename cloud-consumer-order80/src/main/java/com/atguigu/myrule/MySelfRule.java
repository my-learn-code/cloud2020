package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MySelfRule
 * @Description :
 * @Author : Starry_sky
 * @Date: 2020-12-25 10:40  //时间
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
