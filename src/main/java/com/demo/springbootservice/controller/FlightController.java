package com.demo.springbootservice.controller;

import com.demo.springbootservice.Model.Flight;
import com.demo.springbootservice.Model.Seat;
import com.demo.springbootservice.repository.FlightRepository;
import com.demo.springbootservice.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightRepository flightRepository;


    @GetMapping
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }
    @GetMapping("/{id}")
    public Flight getFlights(@PathVariable long id) {
        return flightRepository.findById(id).orElse(new Flight());
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    @PutMapping("{id}")
    public Flight modifyFlight(@PathVariable long id, @RequestBody Flight flight) {
        flight.setId(id);
        return flightRepository.save(flight);
    }

    @DeleteMapping
    public void deleteFlight(@PathVariable long id) {
        flightRepository.deleteById(id);
    }
}