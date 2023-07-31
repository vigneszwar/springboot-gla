package com.demo.springbootservice.university.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ceo")
public class CeoController {
    @Autowired
    private CeoRepository ceoRepository;
    @GetMapping
    public List<Ceo> getCeo() {
        return ceoRepository.findAll();
    }

    @PostMapping
    public void addCeo(@RequestBody Ceo ceo){
        ceoRepository.save(ceo);
    }

}
