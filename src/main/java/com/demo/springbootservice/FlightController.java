package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import com.demo.springbootservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> fd2c84a132f540ede54f4ecf79fd31ce1c861f7f

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
<<<<<<< HEAD
    ArrayList<Flight> flights;

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flights;
    }
    @PostMapping("/flights")
=======
    FlightRepository flightRepository;
    @GetMapping
    public List<Flight> getFlights(@RequestParam(required = false) String name, @RequestParam(required = false) String src) {
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
    public Flight getFlight(@PathVariable Long id) {
        return flightRepository.findById(id).get();
    }

    @PostMapping
>>>>>>> fd2c84a132f540ede54f4ecf79fd31ce1c861f7f
    public Flight addFlight(@RequestBody Flight newFlight) {
        Flight flight = flightRepository.save(newFlight);
        return flight;
    }

<<<<<<< HEAD
    @DeleteMapping("/flights/{name}")
    public void removeFlight(@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.remove(flight);
=======
    @PutMapping("/{id}")
    public Flight replaceFlight(@PathVariable long id, @RequestBody Flight newFlight) {
        return flightRepository.save(newFlight);
    }
    @DeleteMapping("/{id}")
    public void addFlight(@PathVariable long id) {
        flightRepository.deleteById(id);
>>>>>>> fd2c84a132f540ede54f4ecf79fd31ce1c861f7f
    }
   // PUT localhost:8080/flights/{flight_name}

//    @PutMapping("/flights/{flight_name}")
//    public void updateFlight(@RequestBody Flight flight) {
//        //Flight flight = flights.stream().filter(f -> f.getName().equals(flight_name)).findAny().get();
//        flights.add(flight);
//
//    }
    @PutMapping("/flights/{name}")
    public void putFlight(@RequestBody Flight newFlight,@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.set(flights.indexOf(flight),newFlight);
    }


}
