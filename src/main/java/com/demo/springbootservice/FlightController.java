package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

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
    public void addFlight(@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.remove(flight);
    }

    @PutMapping("/flights/{name}")
    public List<Flight> updateFlight(@PathVariable String name,@RequestBody Flight flightDetails) {
        Flight updateFlight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();

        updateFlight.setSrc(flightDetails.getSrc());
        updateFlight.setDest(flightDetails.getDest());
        updateFlight.setDeparture(flightDetails.getDeparture());
        updateFlight.setArrival(flightDetails.getArrival());

        flights.add(updateFlight);

        return flights;
    }

}
