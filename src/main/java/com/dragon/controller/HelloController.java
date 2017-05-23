package com.dragon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenlong on 2017/5/23.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("1")
    public Object hello(){
        return "hello";
    }
}
