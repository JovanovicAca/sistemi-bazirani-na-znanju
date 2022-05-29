package com.example.EuroTraveler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class AccommodationController {

    public AccommodationController() {
    }

    @PostMapping("/accommodation")
    public ResponseEntity<?> createAccommodation() {
        return null;
    }

    @PutMapping("/accommodation/{id}")
    public ResponseEntity<?> updateAccommodation() {
        return null;
    }

    @GetMapping("/accommodation")
    public ResponseEntity<?> getAccommodation() {
        return null;
    }

    @GetMapping("/accommodation/{id}")
    public ResponseEntity<?> getAccommodationById() {
        return null;
    }
}
