package com.eba.triponline.rest;

import com.eba.triponline.domain.Trip;
import com.eba.triponline.service.TripsService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/trips")
public class TripsResource {

    private TripsService service;

    public TripsResource(TripsService service) {
        this.service = service;
    }

    @GetMapping
    public Set<Trip> allTrips() {
        return service.allTrips();
    }

    @GetMapping("/{idTrip}")
    public Trip getTripById(@PathVariable("idTrip") Long id) {
        return service.getTripById(id);
    }
}
