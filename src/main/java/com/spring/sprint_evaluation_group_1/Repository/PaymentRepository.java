package com.spring.sprint_evaluation_group_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sprint_evaluation_group_1.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
