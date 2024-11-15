package com.spring.sprint_evaluation_group_1.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sprint_evaluation_group_1.entity.Address;
import com.spring.sprint_evaluation_group_1.entity.Customer;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	List<Address> findByCity(String city);
	
	List<Address> findByState(String state);
	
}