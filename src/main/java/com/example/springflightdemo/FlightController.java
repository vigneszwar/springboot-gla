package com.example.springflightdemo;

import com.example.springflightdemo.model.Flight;
import com.example.springflightdemo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

//    @Autowired
//    ArrayList<Flight> flights;

    @Autowired
    FlightRepository flightRepository;

    @GetMapping
    public List<Flight> getFlight(){
        return flightRepository.findAll();
    }
//
//    @PostMapping("/flights")
//    public Flight addFlight(@RequestBody Flight newFlight){
//        flights.add(newFlight);
//        return newFlight;
//    }

    @GetMapping("/{id}")
    public Optional<Flight> getFlights(@PathVariable Long id) {
        return flightRepository.findById(id);
    }
    @PostMapping
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }


    @DeleteMapping("/{name}")
    public void addFlight(@PathVariable String name){
//        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
//        flights.remove(flight);
        return;
    }

    @PutMapping("/flights/{name}")
    public void putFlight(@PathVariable String name, @RequestBody Flight newFlight){
//        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
//        flights.set(flights.indexOf(flight),newFlight);
//        return newFlight;
    }

}
