package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import com.demo.springbootservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Flight> getFlight(@PathVariable Long id){
        return flightRepository.findById(id);
    }

    @PostMapping("")
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight save=flightRepository.save(newFlight);
        return save;

    }

    @DeleteMapping("/{name}")
    public void addFlight(@PathVariable String name) {
        return;
    }

    @PutMapping("/{name}")
    public void putFlight(@PathVariable String name,@RequestBody Flight newFlight) {

    }


}
