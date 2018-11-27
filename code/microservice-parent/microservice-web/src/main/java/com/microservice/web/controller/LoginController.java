package com.microservice.web.controller;

import com.microservice.web.client.LoginClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@RestController
public class LoginController {

    @Resource
    private LoginClient loginClient;

    @PostMapping(value = "/login")
    public String login() {
        return loginClient.login();
    }


}
