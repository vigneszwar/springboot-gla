package com.demo.Springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.AbstractRabbitListenerContainerFactoryConfigurer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SampleClass {
    HelloRestApi helloRestApi;
    ArrayList<Integer> ls=new ArrayList<>();

    @Autowired
    public SampleClass(HelloRestApi helloRestApi, ArrayList<Integer> ls){
        this.ls=ls;
        System.out.println(ls);
        System.out.println(helloRestApi.getHelloWorld());
        this.helloRestApi=helloRestApi;
        System.out.println("Sample Class");
    }
}
