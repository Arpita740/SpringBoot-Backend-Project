package com.spring.sprint_evaluation_group_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sprint_evaluation_group_1.dao.AddressesDao;
import com.spring.sprint_evaluation_group_1.entity.Address;

@Service
public class AddressesServices {
	@Autowired
	AddressesDao addressDao;
	
	public List<Address> findByCity(String city) {
        return addressDao.getByCity(city);
	}
        
     public List<Address> findByState(String state) {
            return addressDao.getByState(state);
    }

}