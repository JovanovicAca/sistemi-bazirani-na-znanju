package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.Accomodation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Accomodation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccomodationRepository extends JpaRepository<Accomodation, Long> {}
