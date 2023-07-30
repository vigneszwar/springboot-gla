package com.demo.springbootservice;

import com.demo.springbootservice.model.Flight;
import com.demo.springbootservice.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    @Autowired
    SeatRepository seatRepository;

    @GetMapping
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    @GetMapping("/{flightId}/seats")
    public ResponseEntity<List<Seat>> getSeatsByFlightId(@PathVariable Long flightId) {
        List<Seat> seats = seatRepository.findByFlightId(flightId);
        return ResponseEntity.ok(seats);
    }
}
