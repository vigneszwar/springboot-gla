package com.demo.springworkservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class DemoConfiguration {

    @Bean
    public ArrayList<Integer> getNumbers() {
        System.out.println("Inside Bean method which creates and returns arraylist to spring boot");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return numbers;
    }
}
