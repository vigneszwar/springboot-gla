package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class DemoConfiguration {
    @Bean
    public ArrayList<Flight> getFlights() {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(Flight.builder()
                .departure("12:00 pm")
                .arrival("6:00 pm")
                .src("Delhi Airport")
                .dest("Bangalore Airport")
                .name("Indigo")
                .build());
        return flights;
    }
}