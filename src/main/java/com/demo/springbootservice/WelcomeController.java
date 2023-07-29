package com.demo.springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {
    ArrayList<Integer> numbers;

    @Value("${name}")
    String name;

    @Autowired
    public WelcomeController(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @GetMapping
    public String getWelcomeMessage() {
        return numbers.toString();
    }

    @GetMapping("/name")
    public String getName() {
        return name;
    }
}
