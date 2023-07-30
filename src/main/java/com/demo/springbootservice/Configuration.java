package com.demo.springbootservice;

import com.demo.springbootservice.Model.Flight;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public ArrayList<Flight> getFlights() {
        System.out.println("Inside Configuration");
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(Flight.builder()
                .departure("12:00 pm")
                .arrival("6:00 pm")
                .src("Delhi Airport")
                .dest("Bangalore Airport")
                .name("Indigo")
                .build());
        flights.add(Flight.builder()
                .departure("2:00 am")
                .arrival("5:00 pm")
                .src("Chennai Airport")
                .dest("Pune Airport")
                .name("AirIndia")
                .build());
        return flights;
    }
}
