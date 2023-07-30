package com.demo.springbootservice;

import com.demo.springbootservice.Model.Flight;
import com.demo.springbootservice.Repository.FlightRepository;
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
    public List<Flight> getFlights(@RequestParam(required = false) String name) {
        if(name != null && !name.isEmpty()) {
            Flight flight = flightRepository.findByName(name);
            return List.of(flight);
        }
        return flightRepository.findAll();
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }

    @GetMapping("/{id}")
    public Optional<Flight> getById(@PathVariable long id){
        Optional<Flight> flight=flightRepository.findById(id);
        return flight;
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable long id){
        flightRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Flight putFlight(@PathVariable long id, @RequestBody Flight newflight){
        return flightRepository.save(newflight);
    }
}
