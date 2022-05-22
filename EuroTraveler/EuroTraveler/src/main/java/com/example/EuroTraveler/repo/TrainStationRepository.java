package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.TrainStation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TrainStation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TrainStationRepository extends JpaRepository<TrainStation, Long> {}
