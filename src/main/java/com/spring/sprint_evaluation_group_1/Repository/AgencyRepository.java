package com.spring.sprint_evaluation_group_1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sprint_evaluation_group_1.entity.Agency;


public interface AgencyRepository extends JpaRepository<Agency, Integer> {
	List<Agency> findAll();
	 Optional<Agency> findById(Integer agencyId);

}