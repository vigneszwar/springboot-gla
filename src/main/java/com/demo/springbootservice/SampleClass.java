package com.demo.springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleClass {
    HelloRestApi helloRestApi;

    @Autowired
    public SampleClass(HelloRestApi helloRestApi){
        System.out.println();
        this.helloRestApi=helloRestApi;
        System.out.println("Sample Class");
    }
}
