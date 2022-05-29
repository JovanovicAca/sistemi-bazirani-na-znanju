package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.facts.Accomodation;
import com.example.EuroTraveler.facts.BusStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusStationRepository extends JpaRepository<BusStation,Long> {
}
