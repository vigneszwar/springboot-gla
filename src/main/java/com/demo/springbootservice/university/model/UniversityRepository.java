package com.demo.springbootservice.university.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository  extends JpaRepository<University, Long> {
}
