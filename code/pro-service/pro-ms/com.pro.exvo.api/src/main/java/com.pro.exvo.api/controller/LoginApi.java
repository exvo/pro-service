package com.pro.exvo.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2018/11/13
 * @Author: wu yang
 * @Description:
 */
@RestController
@RequestMapping(value = "login")
public class LoginApi {

    @PostMapping
    public Object login() {
        Map<String, String> result = new HashMap<>();
        result.put("result", "SUCCESS");
        return result;
    }

}