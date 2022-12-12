package com.example.test.javademo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        String format = new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date());
        return "当前时间【" + format + "】";
    }

}
