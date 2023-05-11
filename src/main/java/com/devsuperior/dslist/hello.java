package com.devsuperior.dslist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello{
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}