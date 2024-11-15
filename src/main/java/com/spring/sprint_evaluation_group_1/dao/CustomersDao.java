package com.spring.sprint_evaluation_group_1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.sprint_evaluation_group_1.Repository.CustomerRepository;
//import com.spring.sprint_evaluation_group_1.Repository.CustomersRepository;
import com.spring.sprint_evaluation_group_1.entity.Customer;
@Repository
public class CustomersDao {

    @Autowired
    private CustomerRepository customerRepository;

    
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    
    public Optional<Customer> findById(int customerId) {
        return customerRepository.findById(customerId);
    }
    
    public List<Customer> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public List<Customer> findByPhone(String phone) {
        return customerRepository.findByPhone(phone);
    }
    
    public List<Customer> findByCustomerCity(String city) {
        return customerRepository.findByAddressCity(city);
    }

    public List<Customer> findByCustomerState(String state) {
        return customerRepository.findByAddressState(state);
    }

}