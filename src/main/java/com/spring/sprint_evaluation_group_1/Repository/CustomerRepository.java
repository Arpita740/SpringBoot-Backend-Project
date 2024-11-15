package com.spring.sprint_evaluation_group_1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.sprint_evaluation_group_1.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	List<Customer> findAll();
	Optional<Customer> findById(Integer customerId);
	List<Customer> findByEmail(String email);
    List<Customer> findByPhone(String phone);
    
    @Query("SELECT c FROM Customer c WHERE c.addresses.city = :city")
    List<Customer> findByAddressCity(@Param("city") String city);
    
    @Query("SELECT c FROM Customer c WHERE c.addresses.state = :state")
    List<Customer> findByAddressState(@Param("state") String state);
   
}