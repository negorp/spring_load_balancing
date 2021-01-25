package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController("/test")
public class TestController {
    @GetMapping
    public String testService(HttpServletRequest request) {
        System.out.println("I am " + request.getRequestURL().toString());
        return request.getRequestURL().toString();
    }

}
