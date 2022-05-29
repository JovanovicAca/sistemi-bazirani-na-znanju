package com.example.EuroTraveler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class AirportController {

    public AirportController() {
    }

    @PostMapping("/airport")
    public ResponseEntity<?> createAirport() {
        return null;
    }

    @PutMapping("/airport/{id}")
    public ResponseEntity<?> updateAirport() {
        return null;
    }

    @GetMapping("/airport")
    public ResponseEntity<?> getAirport() {
        return null;
    }

    @GetMapping("/airport/{id}")
    public ResponseEntity<?> getAirportById() {
        return null;
    }
}
