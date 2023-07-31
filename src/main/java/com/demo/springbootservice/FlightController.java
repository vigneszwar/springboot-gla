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
    public Flight getFlight(@PathVariable Long id){
        return flightRepository.findById(id).get();
    }

    @PostMapping("")
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight save=flightRepository.save(newFlight);
        return save;

    }

    @DeleteMapping("/{id}")
    public void addFlight(@PathVariable Long id) {
        flightRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Flight putFlight(@PathVariable Long id,@RequestBody Flight newFlight) {
        return flightRepository.save(newFlight);
    }


}
