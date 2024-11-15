package com.spring.sprint_evaluation_group_1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.Repository.AgencyRepository;
import com.spring.sprint_evaluation_group_1.entity.Agency;

@Repository
public class AgenciesDao {
	@Autowired
	AgencyRepository agenciesRepository; 
	public List<Agency> findAll() {
		 
		return agenciesRepository.findAll();
    }

	public Agency findById(int agencyId) {
        return agenciesRepository.findById(agencyId).orElse(null); 
    }

   
}