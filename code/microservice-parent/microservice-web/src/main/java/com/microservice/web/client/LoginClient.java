package com.microservice.web.client;

import com.microservice.common.constants.GetWays;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@FeignClient(value = GetWays.ZUUL, fallback = LoginClientFallback.class)
public interface LoginClient {

    String PATH = GetWays.ROUTE_API_PATH;

    @PostMapping(value = PATH + "/login")
    String login();

}
