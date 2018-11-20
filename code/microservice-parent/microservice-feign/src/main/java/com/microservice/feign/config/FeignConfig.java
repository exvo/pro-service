package com.microservice.feign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description: feign配置
 */
@Configuration
public class FeignConfig {

    /**
     * feign远程调用失败后会进行重试
     * @return
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1),5);
    }

}
