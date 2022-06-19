package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.facts.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response,Long> {
}
