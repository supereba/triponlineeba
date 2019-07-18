package com.eba.triponline.service;

import com.eba.triponline.domain.Trip;
import java.util.Set;

public interface TripsService {

    Set<Trip> allTrips();
    Trip getTripById(Long id);
}
