package com.eba.triponline.repository;

import com.eba.triponline.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {


}
