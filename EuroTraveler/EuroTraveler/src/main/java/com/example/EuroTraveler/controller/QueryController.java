package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class QueryController {

    public QueryController() {
    }

    @PostMapping("/query")
    public ResponseEntity<?> createQuery() {
        return null;
    }

    @PutMapping("/query/{id}")
    public ResponseEntity<?> updateQuery() {
        return null;
    }

    @GetMapping("/query")
    public ResponseEntity<?> getQuery() {
        return null;
    }

    @GetMapping("/query/{id}")
    public ResponseEntity<?> getQueryById() {
        return null;
    }
}
