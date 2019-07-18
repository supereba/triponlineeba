package com.eba.triponline.service;

import com.eba.triponline.domain.Trip;
import com.eba.triponline.repository.TripRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TripsServiceImpl implements TripsService {

    private TripRepository repository;

    public TripsServiceImpl(TripRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Trip> allTrips() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Trip getTripById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
