package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.BusStation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the BusStation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BusStationRepository extends JpaRepository<BusStation, Long> {}
