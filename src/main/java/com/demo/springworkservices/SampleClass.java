package com.demo.springworkservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SampleClass {
    HelloRestApi helloRestApi;

    ArrayList<Integer> numbers;

    @Autowired
    public SampleClass(HelloRestApi helloRestApi, ArrayList<Integer> numbers) {
        System.out.println(helloRestApi.getHelloWorld());
        System.out.println(numbers);
        this.helloRestApi = helloRestApi;
        this.numbers = numbers;
        System.out.println("Inside Sample Class");
    }


}
