package com.system.hotelmanagement.service.implementation;

import com.system.hotelmanagement.model.Customer;
import com.system.hotelmanagement.repository.CustomerRepository;
import com.system.hotelmanagement.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer customerToUpdate = customerRepository.findById(id).orElseThrow();
        customerToUpdate.setFirstname(customer.getFirstname());
        customerToUpdate.setLastname(customer.getLastname());
        customerToUpdate.setGender(customer.getGender());
        customerToUpdate.setEmail(customer.getEmail());
        customerToUpdate.setPhone_number(customer.getPhone_number());
        customerToUpdate.setAddress(customer.getAddress());
        return customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
