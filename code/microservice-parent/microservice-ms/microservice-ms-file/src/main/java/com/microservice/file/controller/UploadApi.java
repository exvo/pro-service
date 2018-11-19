package com.microservice.file.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2018/11/19
 * @Author: wu yang
 * @Description:
 */
@RestController
@RequestMapping(value = "/upload")
public class UploadApi {

    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    public Object excel() {
        return "Upload File Success";
    }

}
