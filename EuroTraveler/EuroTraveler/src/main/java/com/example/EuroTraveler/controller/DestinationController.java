package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class DestinationController {

    public DestinationController() {
    }

    @PostMapping("/destination")
    public ResponseEntity<?> createDestination() {
        return null;
    }

    @PutMapping("/destination/{id}")
    public ResponseEntity<?> updateDestination() {
        return null;
    }

    @GetMapping("/destination")
    public ResponseEntity<?> getDestination() {
        return null;
    }

    @GetMapping("/destination/{id}")
    public ResponseEntity<?> getDestinationById() {
        return null;
    }
}
