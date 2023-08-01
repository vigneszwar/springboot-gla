package com.demo.springbootservice.repository;

import com.demo.springbootservice.Model.Flight;
import com.demo.springbootservice.Model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByFlightId(Long flightId);
}