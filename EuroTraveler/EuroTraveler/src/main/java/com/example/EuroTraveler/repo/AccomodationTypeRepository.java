package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.AccomodationType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AccomodationType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccomodationTypeRepository extends JpaRepository<AccomodationType, Long> {}
