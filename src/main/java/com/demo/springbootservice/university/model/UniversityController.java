package com.demo.springbootservice.university.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversityController {
    @Autowired
    UniversityRepository universityRepository;
    @PostMapping
    public void addUniversity(@RequestBody University university) {
        universityRepository.save(university);
    }

    @GetMapping
    public List<University> getUniversities() {
        return universityRepository.findAll();
    }
}
