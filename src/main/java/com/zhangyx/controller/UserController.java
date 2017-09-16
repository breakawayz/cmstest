package com.zhangyx.controller;

import com.zhangyx.model.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Config config;

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {

        return "Hello " + myName + "!!!" + "value=" + config.getValue();

    }
}
