package com.demo.springbootservice.repository;

import com.demo.springbootservice.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
     Flight findByName(String name);
     List<Flight> findAllBySrc(String src);
}
