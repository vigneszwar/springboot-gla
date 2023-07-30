package com.demo.springworkservices;

import org.springframework.stereotype.Component;

@Component
public class HelloRestApi {
    public HelloRestApi() {
        System.out.println("I'm inside Hello Rest API class");
    }

    public String getHelloWorld() {
        return "Hello World";
    }
}
