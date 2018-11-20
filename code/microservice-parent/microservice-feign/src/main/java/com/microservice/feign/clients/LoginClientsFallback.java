package com.microservice.feign.clients;

import org.springframework.stereotype.Component;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@Component
public class LoginClientsFallback implements LoginClients {
    @Override
    public Object login() {
        return null;
    }
}
