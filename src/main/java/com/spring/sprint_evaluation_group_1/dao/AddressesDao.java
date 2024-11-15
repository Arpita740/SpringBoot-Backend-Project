package com.spring.sprint_evaluation_group_1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.Repository.AddressRepository;
//import com.spring.sprint_evaluation_group_1.Repository.AddressesRepository;
import com.spring.sprint_evaluation_group_1.entity.Address;

@Repository
public class AddressesDao {
	
	@Autowired
	AddressRepository addressesRepository;
	
	public List<Address> getByCity(String city) {
        return addressesRepository.findByCity(city);
    }
	
	public List<Address> getByState(String state) {
        return addressesRepository.findByState(state);
    }

}