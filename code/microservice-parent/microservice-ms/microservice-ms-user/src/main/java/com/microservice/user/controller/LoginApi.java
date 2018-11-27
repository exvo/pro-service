package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2018/11/19
 * @Author: wu yang
 * @Description:
 */
@RestController
@RequestMapping(value = "/login")
public class LoginApi {

    @Value("${server.port}")
    private String port;

    @PostMapping()
    public String login() {
        try {
            //微服务超时处理
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Login Success" + "PORT:" + port;
    }

}
