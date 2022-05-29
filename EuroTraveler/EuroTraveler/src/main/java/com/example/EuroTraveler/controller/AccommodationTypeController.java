package com.example.EuroTraveler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class AccommodationTypeController {

    public AccommodationTypeController() {
    }

    @PostMapping("/accommodation-type")
    public ResponseEntity<?> createAccommodationType() {
        return null;
    }

    @PutMapping("/accommodation-type/{id}")
    public ResponseEntity<?> updateAccommodationType() {
        return null;
    }

    @GetMapping("/accommodation-type")
    public ResponseEntity<?> getAccommodationType() {
        return null;
    }

    @GetMapping("/accommodation-type/{id}")
    public ResponseEntity<?> getAccommodationTypeById() {
        return null;
    }
}

