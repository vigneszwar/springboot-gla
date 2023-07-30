package com.demo.springbootservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {
    public HelloRestApi(){
        System.out.println("HelloRestApi class");
    }
}
