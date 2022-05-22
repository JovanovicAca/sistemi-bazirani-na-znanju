package com.example.EuroTraveler.repo;

import com.example.EuroTraveler.model.Interests;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Interests entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InterestsRepository extends JpaRepository<Interests, Long> {}
