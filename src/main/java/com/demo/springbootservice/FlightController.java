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
    @GetMapping
    public List<Flight> getFlights(@RequestParam(required = false) String name,@RequestParam(required = false) String src) {
        if(name != null && !name.isEmpty()) {
            Flight flight = flightRepository.findByName(name);
            return List.of(flight);
        }
        if(src != null && !src.isEmpty()) {
            return flightRepository.findAllBySrc(src);
        }
        return flightRepository.findAll();
    }

    @GetMapping("{id}")
    public Flight getFlight(@PathVariable Long id)
    {
        return flightRepository.findById(id).get();
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }

    @PutMapping("/{id}")
    public Flight replaceFlight(@PathVariable long id, @RequestBody Flight newFlight) {
        return flightRepository.save(newFlight);
    }
    @DeleteMapping("/{id}")
    public void addFlight(@PathVariable long id) {
        flightRepository.deleteById(id);
    }


}