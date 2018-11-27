package com.microservice.web.client;

import org.springframework.stereotype.Component;

/**
 * @Date: 2018/11/27
 * @Author: wu yang
 * @Description:
 */
@Component
public class LoginClientFallback implements LoginClient {
    @Override
    public String login() {
        return null;
    }
}
