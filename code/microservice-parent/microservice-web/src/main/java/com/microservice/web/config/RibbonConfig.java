package com.microservice.web.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@Configuration
public class RibbonConfig {

    @Bean(name = "restTemplate")
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
