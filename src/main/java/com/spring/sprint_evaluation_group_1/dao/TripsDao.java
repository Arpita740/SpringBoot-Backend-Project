package com.spring.sprint_evaluation_group_1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.Repository.TripRepository;
import com.spring.sprint_evaluation_group_1.entity.Trip;

@Repository
public class TripsDao {
	@Autowired
TripRepository tripRepository;
	public List<Trip> findAll() {
		return tripRepository.findAll();
	}
	public Trip findById(int trip_id) {
		return tripRepository.findById(trip_id).orElse(null);
	}
	public List<Trip> getTripsByFromCity(String fromCity) {
        return tripRepository.findByRoute_FromCity(fromCity);
    }
	public List<Trip> getTripsByToCity(String toCity) {
		// TODO Auto-generated method stub
		return tripRepository.findByRoute_ToCity(toCity);
	}

}
