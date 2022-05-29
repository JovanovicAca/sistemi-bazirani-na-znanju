package com.example.EuroTraveler.controller;

import javax.persistence.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class ItemController {

    public ItemController() {
    }

    @PostMapping("/item")
    public ResponseEntity<?> createItem() {
        return null;
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<?> updateItem() {
        return null;
    }

    @GetMapping("/item")
    public ResponseEntity<?> getItem() {
        return null;
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<?> getItemById() {
        return null;
    }
}
