package com.microservice.web.client;

import com.microservice.web.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@Component
@FeignClient(value = "MICRO-SERVICE-USER", configuration = FeignConfig.class)
public interface LoginClient {

    String PATH = "/login";

    @PostMapping(value = PATH)
    Object login();

}
