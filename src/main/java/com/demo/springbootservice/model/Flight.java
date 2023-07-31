package com.demo.springbootservice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "departure_airport_id")
    private Airport departureAirport;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "arrival_airport_id")
    private Airport arrivalAirport;

    @JsonManagedReference
    @OneToMany(mappedBy = "flight", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Seat> seats;

}

