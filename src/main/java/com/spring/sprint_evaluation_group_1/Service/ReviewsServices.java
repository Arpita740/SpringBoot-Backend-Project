package com.spring.sprint_evaluation_group_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.sprint_evaluation_group_1.dao.ReviewsDao;
import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
import com.spring.sprint_evaluation_group_1.entity.Review;
import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;

@Service
public class ReviewsServices {
	@Autowired
	 ReviewsDao reviewDao;

	public Review getReviewById(int review_id) {
		
		return reviewDao.findById(review_id).orElse(null) ;
	}

	 public List<Review> getAllReviews() {
	        return reviewDao.findAll();
	    }
	

	 public Review getReviewByTripId(int tripId) {
		    return reviewDao.findReviewByTripId(tripId);
		}
//	 public List<Review> getReviewsByOfficeId(int officeId) {
//	        List<Review> reviews = reviewDao.findReviewsByOfficeId(officeId);
//	        if (reviews.isEmpty()) {
//	            throw new IdNotFoundException("No reviews found for office ID: " + officeId);
//	        }
//	        return reviews;
//	    }

//	 public List<Review> getReviewByAgencyId(int agency_id) {
//	        return reviewDao.getReviewByAgencyId(agency_id);
//	    }

	public List<Review> getReviewByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		 return reviewDao.findReviewByCustomerId(customerId); 
	}
	 
//	 public ResponseStructure<List<Review>> getReviewByTripId(int tripId) {
//	        // Fetch reviews from the DAO layer
//	        List<Review> reviews = reviewDao.findByTripId(tripId);
//
//	        // Create the response structure
//	        ResponseStructure<List<Review>> response = new ResponseStructure<>();
//
//	        // Set status, message, and data in the response
//	        response.setStatus(HttpStatus.OK.value());
//	        response.setMessage("Reviews for the trip retrieved successfully");
//	        response.setData(reviews);
//
//	        return response;  // Return the response structure
//	    }
	
	
//	
//	public ResponseStructure<Review> updateReview(int reviewId, Review updatedReview) {
//        // Call the DAO to update the review
//        Review updatedReviewData = reviewDao.updateReview(reviewId, updatedReview);
//
//        // Prepare the response structure
//        ResponseStructure<Review> response = new ResponseStructure<>();
//        response.setStatus(HttpStatus.OK.value());
//        response.setMessage("Review updated successfully");
//        response.setData(updatedReviewData);
//
//        return response;  // Return the response structure
//    }
}
	
