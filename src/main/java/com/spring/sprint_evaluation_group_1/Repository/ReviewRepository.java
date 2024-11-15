package com.spring.sprint_evaluation_group_1.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
	 List<Review> findByCustomer_CustomerId(int customerId);

//	    @Query("SELECT r FROM Review r JOIN r.agencyOffices ao WHERE ao.officeId = :officeId")
//	    List<Review> findByOfficeId(@Param("officeId") int officeId);

//	    List<Review> findByAgency_AgencyId(int agencyId);

//	    @Query("SELECT r FROM Review r JOIN r.trip t JOIN t.driver d JOIN d.agencyOffice a WHERE a.id = :officeId")
//	    List<Review> findByOfficeId(@Param("officeId") int officeId);
	    

//	    @Query("SELECT r FROM Review r " +
//	           "JOIN r.trip t " +
//	           "JOIN t.driver1 d1 " +
//	           "JOIN d1.agencyOffice a " +
//	           "WHERE a.id = :officeId " +
//	           "OR EXISTS (SELECT 1 FROM t.driver2 d2 JOIN d2.agencyOffice a2 WHERE a2.id = :officeId)")
//	    List<Review> findByAgencyOfficeId(@Param("officeId") int officeId);
	    
//	    @Query("SELECT r FROM Review r " +
//	            "JOIN Trip t ON r.trip.id = t.id " +
//	            "JOIN Driver d ON t.driver.id = d.id " +
//	            "JOIN AgencyOffice a ON d.agencyOffice.id = a.id " +
//	            "WHERE a.id = :officeId")
//	     List<Review> findReviewsByOfficeId(int officeId);

//		List<Review> findByTrip_Driver_AgencyOffice_OfficeId(int officeId);
}
