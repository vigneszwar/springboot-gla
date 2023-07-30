package com.demo.Springbootservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {
    public HelloRestApi(){
        System.out.println("HelloRestApi class");
    }
    public String getHelloWorld(){
        return "Hello World";
    }
}
