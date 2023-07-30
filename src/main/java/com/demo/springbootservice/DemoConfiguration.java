package com.demo.Springbootservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class DemoConfiguration {
    @Bean
    public ArrayList<Integer> getNumbers(){
        System.out.println("Bean method ");
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(2);
        ls.add(3);
        ls.add(4);
        return ls;
    }
}
