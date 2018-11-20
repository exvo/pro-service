package com.microservice.web.controller;

import com.microservice.web.client.LoginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Date: 2018/11/20
 * @Author: wu yang
 * @Description:
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    /*@Resource
    private LoginClient loginClient;

    @PostMapping
    public Object login() {
        return loginClient.login();
    }*/

    @Autowired
    @Qualifier(value = "restTemplate")
    private RestTemplate restTemplate;

    @PostMapping()
    public Object login() {
        return restTemplate.getForObject("http://MICRO-SERVICE-USER/login", String.class);
    }


}
