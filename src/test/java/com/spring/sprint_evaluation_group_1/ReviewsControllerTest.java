package com.spring.sprint_evaluation_group_1;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.sprint_evaluation_group_1.entity.Review;
import com.spring.sprint_evaluation_group_1.Controller.ReviewsController;
import com.spring.sprint_evaluation_group_1.Service.ReviewsServices;
import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ReviewsControllerTest {

    private MockMvc mockMvc;

    @Mock
    private ReviewsServices reviewsServices;

    @InjectMocks
    private ReviewsController reviewsController;

    private Review review;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(reviewsController).build();

        // Initialize the Review object
        review = new Review(1, 5, "Good", new Date(), null, null, null);
    }

    @Test
    public void testGetReviewById() throws Exception {
        // Mock the service call
        when(reviewsServices.getReviewById(1)).thenReturn(review);

        // Perform the GET request
        mockMvc.perform(get("/api/reviews/{review_id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.message").value("Review retrieved successfully"))
                .andExpect(jsonPath("$.data.rating").value(5));
    }

    @Test
    public void testGetAllReviews() throws Exception {
        // Mock the service call
        when(reviewsServices.getAllReviews()).thenReturn(Arrays.asList(review));

        // Perform the GET request
        mockMvc.perform(get("/api/reviews/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.message").value("Reviews retrieved successfully"))
                .andExpect(jsonPath("$.data[0].rating").value(5));
    }

    @Test
    public void testGetReviewByTripId() throws Exception {
        // Mock the service call
        when(reviewsServices.getReviewByTripId(9)).thenReturn(review);

        // Perform the GET request
        mockMvc.perform(get("/api/reviews/tripid/{trip_id}", 9))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.message").value("Reviews for the trip retrieved successfully"))
                .andExpect(jsonPath("$.data.rating").value(5));
    }
    @Test
    public void testGetReviewsByCustomerId() throws Exception {
        // Mock the service call
        List<Review> reviews = Arrays.asList(review);
        when(reviewsServices.getReviewByCustomerId(1)).thenReturn(reviews);

        // Perform the GET request
        mockMvc.perform(get("/api/reviews/customerid/{customer_id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.message").value("Reviews by Customer retrieved successfully"))
                .andExpect(jsonPath("$.data[0].rating").value(5))
                .andExpect(jsonPath("$.data[0].comment").value("Good"));
    }
}
