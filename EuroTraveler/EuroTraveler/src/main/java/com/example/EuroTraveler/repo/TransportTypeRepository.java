package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.TransportType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TransportType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransportTypeRepository extends JpaRepository<TransportType, Long> {}
