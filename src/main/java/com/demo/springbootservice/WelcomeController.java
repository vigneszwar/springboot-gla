package com.demo.Springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WelcomeController {
    ArrayList<Integer> ls;

    @Value("<h1>${name}</h1>")
    String name;

    @Autowired
    public WelcomeController(ArrayList<Integer> ls){
        this.ls=ls;
    }

    @GetMapping
    public String print(){
        return "Hello";
    }
    @GetMapping("/name")
    public String name(){
//        return ls.toString();
        return name;
    }
    @GetMapping("/number")
    public String getWelcomeMessage(){
        return ls.toString();
    }

    @PostMapping
    public String postMapping(){
        return "post mapping";
    }

    @PutMapping
    public String putMapping(){
        return "put mapping";
    }

    @PatchMapping
    public String patchMapping(){
        return "patch mapping";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "delete mapping";
    }
}
