package com.demo.activemq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World Spring-Boot";
    }
}
