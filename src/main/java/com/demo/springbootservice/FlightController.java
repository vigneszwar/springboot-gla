package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
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
    @PutMapping("/flights/{name}")
    public Flight updateFlight(@PathVariable String name, @RequestBody Flight updatedFlight) {
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            if (flight.getName().equals(name)) {
                flight.setSrc(updatedFlight.getSrc());
                flight.setDest(updatedFlight.getDest());
                flight.setDeparture(updatedFlight.getDeparture());
                flight.setArrival(updatedFlight.getArrival());
                return flight;
            }
        }
        return null;
    }
    @DeleteMapping("/flights/{name}")
    public void addFlight(@PathVariable String name) {
        Flight flight = flights.stream().filter(f -> f.getName().equals(name)).findAny().get();
        flights.remove(flight);
    }
}

