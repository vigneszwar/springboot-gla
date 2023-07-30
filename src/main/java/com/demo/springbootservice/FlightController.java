package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FlightController {
    @Autowired
    ArrayList<Flight> flights;

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flights;
    }
    @PostMapping("/flights")
    public Flight addFlight(@RequestBody Flight newFlight) {
        flights.add(newFlight);
        return newFlight;

    }

    @DeleteMapping("/flights/{name}")
    public void removeFlight(@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.remove(flight);
    }
   // PUT localhost:8080/flights/{flight_name}

//    @PutMapping("/flights/{flight_name}")
//    public void updateFlight(@RequestBody Flight flight) {
//        //Flight flight = flights.stream().filter(f -> f.getName().equals(flight_name)).findAny().get();
//        flights.add(flight);
//
//    }
    @PutMapping("/flights/{name}")
    public void putFlight(@RequestBody Flight newFlight,@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.set(flights.indexOf(flight),newFlight);
    }


}
