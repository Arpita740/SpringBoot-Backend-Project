//package com.spring.sprint_evaluation_group_1.Service;
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.spring.sprint_evaluation_group_1.dao.RoutesDao;
//import com.spring.sprint_evaluation_group_1.entity.Route;
//
//@Service
//public class RoutesServices 
//{
//		 @Autowired
//		    private RoutesDao routeDAO;
//
//		    public List<Route> getAllRoutes() {
//		        return routeDAO.getAllRoutes();
//		    }
//
//		    public Route getRouteById(int routeId) {
//		        return routeDAO.getRouteById(routeId);
//		    }
//
//		    public List<Route> getRoutesByFromCity(String fromCity) {
//		        return routeDAO.getRoutesByFromCity(fromCity);
//		    }
//
//		    public List<Route> getRoutesByToCity(String toCity) {
//		        return routeDAO.getRoutesByToCity(toCity);
//		    }
//
//		    public Route getRouteByFromCityAndToCity(String fromCity, String toCity) {
//		        return routeDAO.getRouteByFromCityAndToCity(fromCity, toCity);
//		    }
//}