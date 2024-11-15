
package com.spring.sprint_evaluation_group_1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sprint_evaluation_group_1.dao.CustomersDao;
import com.spring.sprint_evaluation_group_1.entity.Customer;

@Service
public class CustomersServices {

    @Autowired
    private CustomersDao customerDao;

    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    
    public Customer getCustomerById(int customerId) {
        return customerDao.findById(customerId).orElse(null);
    }

    
    public List<Customer> findByEmail(String email) {
        return customerDao.findByEmail(email);
    }

    public List<Customer> findByPhone(String phone) {
        return customerDao.findByPhone(phone);
    }
    
    public List<Customer> findByCity(String city) {
        return customerDao.findByCustomerCity(city);
    }
    
    public List<Customer> findByState(String state) {
        return customerDao.findByCustomerState(state);
    }



    
    
}
