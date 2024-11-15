

package com.spring.sprint_evaluation_group_1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.Repository.ReviewRepository;
import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
import com.spring.sprint_evaluation_group_1.entity.Review;
import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;

@Repository
public class ReviewsDao {
	@Autowired
	ReviewRepository reviewRepository;

	public Optional<Review> findById(int reviewId) {
        return reviewRepository.findById(reviewId);
    }

    // Method to find all reviews
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    public Review findReviewByTripId(int tripId) {
        return reviewRepository.findById(tripId).orElse(null);  
    }
    public List<Review> findReviewByCustomerId(int customerId) {
        return reviewRepository.findByCustomer_CustomerId(customerId);  // Call the repository method
    }


//    public List<Review> getReviewByAgencyId(int agency_id) {
//        return reviewRepository.findByAgency_AgencyId(agency_id);
//    }
    
    
//    public Review updateReview(int reviewId, Review updatedReview) {
//        Optional<Review> existingReview = reviewRepository.findById(reviewId);
//
//        if (!existingReview.isPresent()) {
//            throw new IdNotFoundException("Review not found for ID: " + reviewId);
//        }
//
//        Review reviewToUpdate = existingReview.get();
//        
//        // Set the updated values (using the actual entities, not just IDs)
//        reviewToUpdate.setRating(updatedReview.getRating());
//        reviewToUpdate.setComment(updatedReview.getComment());
//        reviewToUpdate.setReviewDate(updatedReview.getReviewDate());
//
//        // Set the entire associated entities, not just the ID
//        reviewToUpdate.setTrips(updatedReview.getTripsById());  // This is the Trip object
//        reviewToUpdate.setCustomer(updatedReview.getCustomer());  // This is the Customer object
//
//        // Save the updated review and return it
//        return reviewRepository.save(reviewToUpdate);
//    }

   
//
//    public List<Review> findReviewsByOfficeId(int officeId) {
//        return reviewRepository.findByTrip_Driver_AgencyOffice_OfficeId(officeId);
//    }
	

    }
