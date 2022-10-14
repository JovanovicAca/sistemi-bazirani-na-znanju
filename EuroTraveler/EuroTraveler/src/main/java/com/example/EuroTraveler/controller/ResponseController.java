package com.example.EuroTraveler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class ResponseController {

    public ResponseController() {

    }

    @PostMapping("/response")
    public ResponseEntity<?> createRequest() {
        return null;
    }

    @PutMapping("/response/{id}")
    public ResponseEntity<?> updateRequest() {
        return null;
    }

    @GetMapping("/response")
    public ResponseEntity<?> getRequest() {
        return null;
    }

    @GetMapping("/response/{id}")
    public ResponseEntity<?> getRequestById() {
        return null;
    }

}
