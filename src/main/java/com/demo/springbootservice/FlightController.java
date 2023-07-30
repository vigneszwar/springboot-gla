package com.demo.springbootservice;

import com.demo.springbootservice.Model.Flight;
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
    public String deleteFlight(@PathVariable String name){
        Flight flight=flights.stream().filter(f->f.getName().equals(name)).findAny().get();
        flights.remove(flight);
        return flight.getName()+"deleted";
    }

    @PutMapping("/flights/{name}")
    public ArrayList<Flight> putFlight(@PathVariable String name, @RequestBody Flight newflight){
        Flight flight=flights.stream().filter(f->f.getName().equals(name)).findAny().get();
        flights.set(flights.indexOf(flight),newflight);
        return flights;
    }
}
