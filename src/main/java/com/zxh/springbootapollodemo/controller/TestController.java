package com.zxh.springbootapollodemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${count}")
    private Integer count;

    @GetMapping("/get")
    public String test() {
        return "count的值：" + count;
    }
}
