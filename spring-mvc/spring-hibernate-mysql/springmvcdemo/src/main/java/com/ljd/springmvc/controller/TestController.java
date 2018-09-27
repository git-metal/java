package com.ljd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("TestController")
@RequestMapping(produces = "application/json;charset=UTF-8")
public class TestController {

    @GetMapping(value = "/test/version")
    public Object getVersion()
    {
        System.out.println("zzzzz");
        return "{\"version:\":\"Test 1.0.0\"}";
    }

}
