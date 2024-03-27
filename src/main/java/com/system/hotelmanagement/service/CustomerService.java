package com.system.hotelmanagement.service;

import com.system.hotelmanagement.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    public Customer createCustomer(Customer customer);
    public Optional<Customer> getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
