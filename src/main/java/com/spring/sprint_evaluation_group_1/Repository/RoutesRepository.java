
package com.spring.sprint_evaluation_group_1.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sprint_evaluation_group_1.entity.Route;

public interface RoutesRepository extends JpaRepository<Route, Integer>
{
	 List<Route> findByFromCity(String fromCity);
	 List<Route> findByToCity(String toCity);
     Route findByFromCityAndToCity(String fromCity, String toCity);
}
