package com.example.EuroTraveler.repo;

import org.springframework.data.jpa.repository.*;
import com.example.EuroTraveler.model.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Query entity.
 */
@SuppressWarnings("unused")
@Repository
public interface QueryRepository extends JpaRepository<Query, Long> {}
