package com.example.springflightdemo;

import com.example.springflightdemo.model.Flight;
import com.example.springflightdemo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    ArrayList<Flight> flights;

    @Autowired
    FlightRepository flightRepository;

//    @GetMapping("/flights")
//    public List<Flight> getFlight(){
//        return flights;
//    }
//
//    @PostMapping("/flights")
//    public Flight addFlight(@RequestBody Flight newFlight){
//        flights.add(newFlight);
//        return newFlight;
//    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }
    @GetMapping
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    @DeleteMapping("/flights/{name}")
    public void addFlight(@PathVariable String name){
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.remove(flight);
    }

    @PutMapping("/flights/{name}")
    public Flight putFlight(@PathVariable String name, @RequestBody Flight newFlight){
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.set(flights.indexOf(flight),newFlight);
        return newFlight;
    }

}
