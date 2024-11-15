package com.spring.sprint_evaluation_group_1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.entity.Trip;
@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {
List<Trip> findAll();
Optional<Trip> findById(Integer trip_id);

List<Trip> findByRoute_FromCity(String fromCity);
List<Trip> findByRoute_ToCity(String toCity);
}
