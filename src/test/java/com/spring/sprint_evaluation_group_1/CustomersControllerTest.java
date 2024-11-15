//package com.spring.sprint_evaluation_group_1;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import com.spring.sprint_evaluation_group_1.Controller.CustomersController;
//import com.spring.sprint_evaluation_group_1.Service.CustomersServices;
//
//import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
//import com.spring.sprint_evaluation_group_1.entity.Customer;
//import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.HttpStatus;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//@ExtendWith(MockitoExtension.class)
//public class CustomersControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private CustomersServices customerService;
//
//    @InjectMocks
//    private CustomersController customerController;
//
//    @BeforeEach
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
//    }
//
//    @Test
//    public void testGetCustomersByCity_Success() throws Exception {
//        // Arrange: Set up a mock customer list and service behavior
//        Customer customer1 = new Customer(1, "John Doe", "john@example.com", "9087654325", "City A");
//        List<Customer> customers = Arrays.asList(customer1);
//
//        when(customerService.findByCity("City A")).thenReturn(customers);
//
//        // Act & Assert: Perform the GET request and verify the response
//        mockMvc.perform(get("/api/customers/city/{city}", "City A"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.status").value(HttpStatus.OK.value()))
//                .andExpect(jsonPath("$.message").value("Customers retrieved successfully"))
//                .andExpect(jsonPath("$.data[0].name").value("John Doe"))
//                .andExpect(jsonPath("$.data[0].city").value("City A"));
//    }
//
//}
