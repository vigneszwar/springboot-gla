package com.demo.springbootservice.controller;

import com.demo.springbootservice.Model.Airport;
import com.demo.springbootservice.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {
    @Autowired
    AirportRepository airportRepository;
    @GetMapping
    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

    @PostMapping
    public Airport addAirport(@RequestBody Airport airport) {
        return airportRepository.save(airport);
    }
}