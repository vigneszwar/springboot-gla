package com.demo.springbootservice.Repository;

import com.demo.springbootservice.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    Flight findByName(String name);
}