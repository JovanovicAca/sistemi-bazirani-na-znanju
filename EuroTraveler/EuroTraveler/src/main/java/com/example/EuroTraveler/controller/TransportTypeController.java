package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class TransportTypeController {

    public TransportTypeController() {
    }

    @PostMapping("/transport-type")
    public ResponseEntity<?> createTransportType() {
        return null;
    }

    @PutMapping("/transport-type/{id}")
    public ResponseEntity<?> updateTransportType() {
        return null;
    }

    @GetMapping("/transport-type")
    public ResponseEntity<?> getTransportType() {
        return null;
    }

    @GetMapping("/transport-type/{id}")
    public ResponseEntity<?> getTransportTypeById() {
        return null;
    }
}
