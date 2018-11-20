package com.microservice.feign.clients;

import com.microservice.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@FeignClient(value = "MICRO-SERVICE-USER", configuration = FeignConfig.class)
public interface LoginClients {

    String PATH = "/login";

    @PostMapping(value = PATH)
    Object login();

}
