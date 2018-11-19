package com.microservice.user.controller;

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

    @PostMapping()
    public Object login() {
        return "Login Success";
    }

}
