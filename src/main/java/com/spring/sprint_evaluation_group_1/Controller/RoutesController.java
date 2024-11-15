//package com.spring.sprint_evaluation_group_1.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.sprint_evaluation_group_1.Service.RoutesServices;
//import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
//import com.spring.sprint_evaluation_group_1.entity.Route;
//import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;
//
//
//@RestController
//@RequestMapping("/api/routes")
//public class RoutesController 
//{
//	 @Autowired
//	    private RoutesServices routesService;
//
//	 @GetMapping
//	    public ResponseEntity<ResponseStructure<List<Route>>> getAllRoutes() {
//	        List<Route> routes = routesService.getAllRoutes();
//	        if(routes==null)
//	        {
//	        	throw new NoDataFoundException("No Data Found ");
//	        }
//	        ResponseStructure<List<Route>> response = new ResponseStructure<>();
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Routes retrieved successfully");
//	        response.setData(routes);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
//
//	 @GetMapping("/{route_id}")
//	    public ResponseEntity<ResponseStructure<Route>> getRouteById(@PathVariable("route_id") int routeId) {
//	        Route route = routesService.getRouteById(routeId);
//	        if (route == null) {
//	            throw new IdNotFoundException("Route not found with ID: " + routeId);
//	        }
//	        ResponseStructure<Route> response = new ResponseStructure<>();
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Route retrieved successfully");
//	        response.setData(route);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
//
//	 	@GetMapping("/fromcity/{from_city}")
//	    public ResponseEntity<ResponseStructure<List<Route>>> getRoutesByFromCity(@PathVariable("from_city") String fromCity) {
//	        List<Route> routes = routesService.getRoutesByFromCity(fromCity);
//	        if(routes.isEmpty())
//	        {
//	        	throw new NoDataFoundException("No Routes from City Found "+fromCity);
//	        }
//	        ResponseStructure<List<Route>> response = new ResponseStructure<>();
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Routes retrieved successfully from " + fromCity);
//	        response.setData(routes);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
//	 	@GetMapping("/tocity/{to_city}")
//	    public ResponseEntity<ResponseStructure<List<Route>>> getRoutesByToCity(@PathVariable("to_city") String toCity) {
//	        List<Route> routes = routesService.getRoutesByToCity(toCity);
//	        if(routes.isEmpty())
//	        {
//	        	throw new NoDataFoundException("No Routes to City Found "+toCity);
//	        }
//	        ResponseStructure<List<Route>> response = new ResponseStructure<>();
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Routes retrieved successfully to " + toCity);
//	        response.setData(routes);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
//
//	 	@GetMapping("/{from_city}/{to_city}")
//	    public ResponseEntity<ResponseStructure<Route>> getRouteByFromCityAndToCity(@PathVariable("from_city") String fromCity, 
//	                                                                      @PathVariable("to_city") String toCity) {
//	        Route route = routesService.getRouteByFromCityAndToCity(fromCity, toCity);
//	        if (route == null) {
//	            throw new NoDataFoundException("Route not found between " + fromCity + " and " + toCity);
//	        }
//	        ResponseStructure<Route> response = new ResponseStructure<>();
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Route retrieved successfully between " + fromCity + " and " + toCity);
//	        response.setData(route);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
//}