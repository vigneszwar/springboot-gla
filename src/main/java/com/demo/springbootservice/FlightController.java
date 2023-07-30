package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import com.demo.springbootservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightRepository flightRepository;
//    @GetMapping
//    public List<Flight> getFlights() {
//        return flightRepository.findAll();
//    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }

    @PutMapping("/{name}")
    public Flight replaceFlight(@PathVariable String name, @RequestBody Flight newFlight) {
        return null;
    }

    @DeleteMapping("/{name}")
    public void addFlight(@PathVariable String name) {

    }
    @GetMapping("{id}")
    public Flight getflight(@PathVariable Long id){
        return flightRepository.findById((id)).get();
    }

    @GetMapping
    public List<Flight> getFlights(@RequestParam(required = false) String name){
        if(name!=null && !name.isEmpty()){
            Flight flight= flightRepository.findByName(name);
            return List.of(flight);
        }
        return flightRepository.findAll();
    }





}
