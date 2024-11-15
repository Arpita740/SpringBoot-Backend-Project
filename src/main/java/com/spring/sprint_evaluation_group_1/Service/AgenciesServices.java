package com.spring.sprint_evaluation_group_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;


import com.spring.sprint_evaluation_group_1.Repository.AgencyRepository;
import com.spring.sprint_evaluation_group_1.entity.Agency;

@Service
public class AgenciesServices {
	 @Autowired
	    private AgencyRepository agenciesRepository;

	  
	    public List<Agency> getAllAgencies() {
	        return agenciesRepository.findAll();
	    }

	   
	    public Optional<Agency> getAgencyById(int agencyId) {
	        return agenciesRepository.findById(agencyId);
	    }
	}