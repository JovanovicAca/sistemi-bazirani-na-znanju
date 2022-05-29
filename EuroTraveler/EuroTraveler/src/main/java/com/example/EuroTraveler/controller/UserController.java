package com.example.EuroTraveler.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class UserController {

    public UserController() {
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUser() {
        return null;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById() {
        return null;
    }
}
