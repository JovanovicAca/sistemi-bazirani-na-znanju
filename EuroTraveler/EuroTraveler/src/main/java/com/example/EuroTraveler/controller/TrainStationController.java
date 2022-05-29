package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class TrainStationController {

    public TrainStationController() {
    }

    @PostMapping("/train-station")
    public ResponseEntity<?> createTrainStation() {
        return null;
    }

    @PutMapping("/train-station/{id}")
    public ResponseEntity<?> updateTrainStation() {
        return null;
    }

    @GetMapping("/train-station")
    public ResponseEntity<?> getTrainStation() {
        return null;
    }

    @GetMapping("/train-station/{id}")
    public ResponseEntity<?> getTrainStationById() {
        return null;
    }
}
