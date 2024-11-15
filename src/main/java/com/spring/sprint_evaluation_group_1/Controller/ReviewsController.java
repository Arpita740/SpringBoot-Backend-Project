package com.spring.sprint_evaluation_group_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sprint_evaluation_group_1.Service.ReviewsServices;
import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
import com.spring.sprint_evaluation_group_1.entity.Review;
import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;
import com.spring.sprint_evaluation_group_1.exception.NoDataFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("api/reviews")
public class ReviewsController {
	@Autowired
	ReviewsServices reviewsServices;
	
	
	 @Operation(summary = "Get Review by ID", description = "Retrieve a review by its unique review ID")
	    @ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Review retrieved successfully"),
	        @ApiResponse(responseCode = "404", description = "Review not found")
	    })
	@GetMapping("/{review_id}")
	public ResponseEntity<ResponseStructure<Review>> getReviewById(@PathVariable("review_id") int reviewId) {
		Review review = reviewsServices.getReviewById(reviewId);
		if (review == null) {
			throw new IdNotFoundException("Review not found with ID: " + reviewId);
		}
		ResponseStructure<Review> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("Review retrieved successfully");
		response.setData(review);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	 @Operation(summary = "Get All Reviews", description = "Retrieve all reviews in the system")
	    @ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Reviews retrieved successfully"),
	        @ApiResponse(responseCode = "404", description = "No reviews found")
	    })
	@GetMapping("/all")
	public ResponseEntity<ResponseStructure<List<Review>>> getAllReviews() {
		List<Review> reviews = reviewsServices.getAllReviews();
		if (reviews.isEmpty()) {
			throw new NoDataFoundException("Review List is empty");
		}
		ResponseStructure<List<Review>> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("Reviews retrieved successfully");
		response.setData(reviews);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	 @Operation(summary = "Get Review by Trip ID", description = "Retrieve reviews by the associated trip ID")
	    @ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Reviews for the trip retrieved successfully"),
	        @ApiResponse(responseCode = "404", description = "No reviews found for the trip ID")
	    })
	@GetMapping("/tripid/{trip_id}")
	public ResponseEntity<ResponseStructure<Review>> getReviewByTripId(@PathVariable("trip_id") int tripId) {
		Review reviews = reviewsServices.getReviewByTripId(tripId);
		if (reviews==null) {
			throw new NoDataFoundException("No reviews found for trip ID: " + tripId);
		}
		ResponseStructure<Review> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("Reviews for the trip retrieved successfully");
		response.setData(reviews);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	 @Operation(summary = "Get Reviews by Customer ID", description = "Retrieve all reviews written by a specific customer")
	    @ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Reviews by customer retrieved successfully"),
	        @ApiResponse(responseCode = "404", description = "No reviews found for the customer ID")
	    })
	@GetMapping("/customerid/{customer_id}")
	public ResponseEntity<ResponseStructure<List<Review>>> getCustomerByCustomerId(
			@PathVariable("customer_id") int customerId) {
		List<Review> reviews = reviewsServices.getReviewByCustomerId(customerId);
		if (reviews.isEmpty()) {
			throw new NoDataFoundException("No reviews found for customer ID: " + customerId);
		}
		ResponseStructure<List<Review>> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("Reviews by Customer retrieved successfully");
		response.setData(reviews);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
//	@GetMapping("/office/{office_id}")
//    public ResponseEntity<ResponseStructure<List<Review>>> getReviewsByOfficeId(@PathVariable ("office_id") int officeId) {
//        List<Review> reviews = reviewsServices.getReviewsByOfficeId(officeId);
//        ResponseStructure<List<Review>> response = new ResponseStructure<>();
//        response.setStatus(HttpStatus.OK.value());
//        response.setMessage("Reviews for the office retrieved successfully");
//        response.setData(reviews);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//	@GetMapping("/agency/{agency_id}")
//    public ResponseEntity<ResponseStructure<List<Review>>> getReviewByAgencyId(@PathVariable("agency_id") int agency_id) {
//        List<Review> reviews = reviewsServices.getReviewByAgencyId(agency_id);
//        if (reviews.isEmpty()) {
//            throw new IdNotFoundException("No reviews found for agency ID: " + agency_id);
//        }
//        ResponseStructure<List<Review>> response = new ResponseStructure<>();
//        response.setStatus(HttpStatus.OK.value());
//        response.setMessage("Reviews by Agency retrieved successfully");
//        response.setData(reviews);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

//	@PutMapping("/{review_id}")
//	public ResponseEntity<ResponseStructure<Review>> updateReview(@PathVariable("review_id") int reviewId,
//			@RequestBody Review updatedReview) {
//
//		try {
//			// Call the service to update the review
//			ResponseStructure<Review> response = reviewsServices.updateReview(reviewId, updatedReview);
//			return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
//		} catch (IdNotFoundException ex) {
//			// Handle exception if the review is not found
//			ResponseStructure<Review> errorResponse = new ResponseStructure<>();
//			errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//			errorResponse.setMessage(ex.getMessage());
//			errorResponse.setData(null);
//			return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//		}
//	}
}
