//package com.spring.sprint_evaluation_group_1.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.spring.sprint_evaluation_group_1.Repository.RoutesRepository;
//import com.spring.sprint_evaluation_group_1.entity.Route;
//
//@Repository
//public class RoutesDao
//{
//	 @Autowired
//    private RoutesRepository routeRepository;
//
//    public List<Route> getAllRoutes() {
//        return routeRepository.findAll();
//    }
//
//    public Route getRouteById(int routeId) {
//        return routeRepository.findById(routeId).orElse(null);
//    }
//
//    public List<Route> getRoutesByFromCity(String fromCity) {
//        return routeRepository.findByFromCity(fromCity);
//    }
//    
//    public List<Route> getRoutesByToCity(String toCity) {
//        return routeRepository.findByToCity(toCity);
//    }
//
//    public Route getRouteByFromCityAndToCity(String fromCity, String toCity) {
//        return routeRepository.findByFromCityAndToCity(fromCity, toCity);
//    }
//}