package com.pedromoreira.planner.planner.activity;

import com.pedromoreira.planner.planner.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    List<Activity> findByTripId(UUID tripId);

    UUID trip(Trip trip);
}
