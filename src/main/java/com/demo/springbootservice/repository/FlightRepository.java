package com.demo.springbootservice.Repository;


import com.demo.springbootservice.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    public Flight findByName(String Name);


}