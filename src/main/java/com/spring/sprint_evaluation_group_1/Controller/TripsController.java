//package com.spring.sprint_evaluation_group_1.Controller;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.sprint_evaluation_group_1.Service.TripsServices;
//import com.spring.sprint_evaluation_group_1.entity.Trip;
//
//@RestController
//@RequestMapping("api/trips")
//public class TripsController {
//
//    @Autowired
//    private TripsServices tripsServices;
//
//    @GetMapping("/{trip_id}")
//    public Trip getTripById(@PathVariable("trip_id") int trip_id) {
//        return tripsServices.getTripById(trip_id);
//    }
//
//    @GetMapping("/all")
//    public List<Trip> getAllTrips() {
//        return tripsServices.getAllTrips();
//    }
//
//    @GetMapping("/from_city/{from_city}")
//    public List<Trip> getTripsByFromCity(@PathVariable("from_city") String fromCity) {
//        return tripsServices.getTripsByFromCity(fromCity);
//    }
//
//    @GetMapping("/to_city/{to_city}")
//    public List<Trip> getTripsByToCity(@PathVariable("to_city") String toCity) {
//        return tripsServices.getTripsByToCity(toCity);
//    }
//
//    @GetMapping("/bus-type/{type}")
//    public List<Trip> getTripsByBusType(@PathVariable("type") String busType) {
//        return tripsServices.getTripsByBusType(busType);
//    }
//
//    @GetMapping("/trip-date/{trip_date}")
//    public List<Trip> getTripsByTripDate(@PathVariable("trip_date") String tripDate) {
//        LocalDate date = LocalDate.parse(tripDate);
//        return tripsServices.getTripsByTripDate(date);
//    }
//
//    @GetMapping("/{from_city}/{to_city}/{trip_date}")
//    public List<Trip> getTripsByFromCityToCityAndDate(
//            @PathVariable("from_city") String fromCity,
//            @PathVariable("to_city") String toCity,
//            @PathVariable("trip_date") String tripDate) {
//        LocalDate date = LocalDate.parse(tripDate);
//        return tripsServices.getTripsByFromCityToCityAndDate(fromCity, toCity, date);
//    }
//
//    @GetMapping("/{from_city}/{to_city}/{trip_date}/{bus_type}")
//    public List<Trip> getTripsByFromCityToCityDateAndBusType(
//            @PathVariable("from_city") String fromCity,
//            @PathVariable("to_city") String toCity,
//            @PathVariable("trip_date") String tripDate,
//            @PathVariable("bus_type") String busType) {
//        LocalDate date = LocalDate.parse(tripDate);
//        return tripsServices.getTripsByFromCityToCityDateAndBusType(fromCity, toCity, date, busType);
//    }
//}
