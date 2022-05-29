package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.facts.Accomodation;
import com.example.EuroTraveler.facts.TrainStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainStationRepository extends JpaRepository<TrainStation,Long> {
}
