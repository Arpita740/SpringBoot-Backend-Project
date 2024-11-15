
package com.spring.sprint_evaluation_group_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sprint_evaluation_group_1.Service.AddressesServices;
import com.spring.sprint_evaluation_group_1.Service.CustomersServices;
import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;
import com.spring.sprint_evaluation_group_1.entity.Customer;
import com.spring.sprint_evaluation_group_1.exception.IdNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

	@Autowired
	private CustomersServices customerService;
	@Autowired
	private AddressesServices addressService;
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Customer>>> getCustomersByEmail() {
	    List<Customer> customers = customerService.getAllCustomers();
	    if (customers.isEmpty()) {
	        throw new IdNotFoundException("Customer List is empty" );
	    }
	    ResponseStructure<List<Customer>> response = new ResponseStructure<>();
	    response.setStatus(HttpStatus.OK.value());
	    response.setMessage("Customers retrieved successfully");
	    response.setData(customers);

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}


	@GetMapping("/{customer_id}")
	public ResponseEntity<ResponseStructure<Customer>> getCustomerById(@PathVariable("customer_id") int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		if (customer == null) {
			throw new IdNotFoundException("Customer not found with ID: " + customerId);
		}
		ResponseStructure<Customer> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("Customer retrieved successfully");
		response.setData(customer);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	
	
	
	@GetMapping("/email/{email}")
	public ResponseEntity<ResponseStructure<List<Customer>>> getCustomersByEmail(@PathVariable String email) {
	    List<Customer> customers = customerService.findByEmail(email);
	    if (customers.isEmpty()) {
	        throw new IdNotFoundException("No customers found with email: " + email);
	    }
	    ResponseStructure<List<Customer>> response = new ResponseStructure<>();
	    response.setStatus(HttpStatus.OK.value());
	    response.setMessage("Customers retrieved successfully");
	    response.setData(customers);

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}


	@GetMapping("/phone/{phone}")
	public ResponseEntity<ResponseStructure<List<Customer>>> getCustomersByPhone(@PathVariable String phone) {
	    List<Customer> customers = customerService.findByPhone(phone);
	    if (customers.isEmpty()) {
	        throw new IdNotFoundException("No customers found with phone: " + phone);
	    }
	    ResponseStructure<List<Customer>> response = new ResponseStructure<>();
	    response.setStatus(HttpStatus.OK.value());
	    response.setMessage("Customers retrieved successfully");
	    response.setData(customers);

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@GetMapping("/city/{city}")
	@Operation(summary = "Get Customers by City", description = "Retrieve a list of customers located in the specified city")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Customers retrieved successfully"),
	    @ApiResponse(responseCode = "404", description = "No customers found in the specified city")
	})

    public ResponseEntity<ResponseStructure<List<Customer>>> getCustomersByCity(@PathVariable("city") String city) {
        List<Customer> customers = customerService.findByCity(city);

        if (customers.isEmpty()) {
            throw new IdNotFoundException("No customers found in city: " + city);
        }

        ResponseStructure<List<Customer>> response = new ResponseStructure<>();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("Customers retrieved successfully");
        response.setData(customers);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
	
	@GetMapping("/state/{state}")
    public ResponseEntity<ResponseStructure<List<Customer>>> getCustomersByState(@PathVariable("state") String state) {
        List<Customer> customers = customerService.findByState(state);

        if (customers.isEmpty()) {
            throw new IdNotFoundException("No customers found with State: " + state);
        }

        ResponseStructure<List<Customer>> response = new ResponseStructure<>();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("Customers retrieved successfully");
        response.setData(customers);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

	

}
