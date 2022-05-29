package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class InterestsController {

    public InterestsController() {
    }

    @PostMapping("/interests")
    public ResponseEntity<?> createInterests() {
        return null;
    }

    @PutMapping("/interests/{id}")
    public ResponseEntity<?> updateInterests() {
        return null;
    }

    @GetMapping("/interests")
    public ResponseEntity<?> getInterests() {
        return null;
    }

    @GetMapping("/interests/{id}")
    public ResponseEntity<?> getInterestsById() {
        return null;
    }
}
