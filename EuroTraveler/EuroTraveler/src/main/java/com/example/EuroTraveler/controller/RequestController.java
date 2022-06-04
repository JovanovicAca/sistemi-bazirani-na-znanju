package com.example.EuroTraveler.controller;

import com.example.EuroTraveler.facts.Request;
import com.example.EuroTraveler.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class RequestController {
    
    @Autowired
    private com.example.EuroTraveler.service.RequestService RequestService;

    public RequestController() {
    }

    @PostMapping("/request")
    public ResponseEntity<?> createRequest(@RequestBody Request Request) {
        return null;
    }

    @PutMapping("/request/{id}")
    public ResponseEntity<?> updateRequest() {
        return null;
    }

    @GetMapping("/request")
    public ResponseEntity<?> getRequest() {
        return null;
    }

    @GetMapping("/request/{id}")
    public ResponseEntity<?> getRequestById() {
        return null;
    }
}
