package com.example.EuroTraveler.controller;

import javax.persistence.*;

import com.example.EuroTraveler.facts.DTO.ResultDTO;
import com.example.EuroTraveler.facts.Item;
import com.example.EuroTraveler.facts.Query;
import com.example.EuroTraveler.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
@Transactional
public class QueryController {

    @Autowired
    private QueryService queryService;

    public QueryController() {
    }

    @PostMapping("/query")
    public ResponseEntity<?> createQuery(@RequestBody Query query) {
        ResultDTO result = new ResultDTO();
        ResultDTO newResult = queryService.getDrools(result,query);
        return new ResponseEntity<>(newResult, HttpStatus.OK);
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
