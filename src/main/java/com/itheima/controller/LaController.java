package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lalala")
public class LaController
{

    @GetMapping
    public String say()
    {
        System.out.println("测试成功");
        return "lalala测试成功";
    }
}
