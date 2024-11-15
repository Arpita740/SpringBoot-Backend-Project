//package com.spring.sprint_evaluation_group_1.Service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.spring.sprint_evaluation_group_1.entity.Trip;
//import com.spring.sprint_evaluation_group_1.repository.TripRepository;
//
//@Service
//public class TripsServices {
//
//    @Autowired
//    private TripRepository tripRepository;
//
//    public Trip getTripById(int tripId) {
//        return tripRepository.findById(tripId).orElse(null);
//    }
//
//    public List<Trip> getAllTrips() {
//        return tripRepository.findAll();
//    }
//
//    public List<Trip> getTripsByFromCity(String fromCity) {
//        return tripRepository.findByFromCity(fromCity);
//    }
//
//    public List<Trip> getTripsByToCity(String toCity) {
//        return tripRepository.findByToCity(toCity);
//    }
//
//    public List<Trip> getTripsByBusType(String type) {
//        return tripRepository.findByBusType(type);
//    }
//
//    public List<Trip> getTripsByTripDate(String tripDate) {
//        return tripRepository.findByTripDate(tripDate);
//    }
//
//    public List<Trip> getTripsByBusTypeAndTripDate(String type, String tripDate) {
//        return tripRepository.findByBusTypeAndTripDate(type, tripDate);
//    }
//
//    public List<Trip> getTripsByFromCityToCityAndDate(String fromCity, String toCity, String tripDate) {
//        return tripRepository.findByFromCityAndToCityAndTripDate(fromCity, toCity, tripDate);
//    }
//}
