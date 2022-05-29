package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class BusStationController {

    public BusStationController() {
    }

    @PostMapping("/bus-station")
    public ResponseEntity<?> createBusStation() {
        return null;
    }

    @PutMapping("/bus-station/{id}")
    public ResponseEntity<?> updateBusStation() {
        return null;
    }

    @GetMapping("/bus-station")
    public ResponseEntity<?> getBusStation() {
        return null;
    }

    @GetMapping("/bus-station/{id}")
    public ResponseEntity<?> getBusStationById() {
        return null;
    }
}
