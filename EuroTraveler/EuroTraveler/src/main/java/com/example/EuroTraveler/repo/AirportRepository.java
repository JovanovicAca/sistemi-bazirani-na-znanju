package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.facts.Accomodation;
import com.example.EuroTraveler.facts.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
