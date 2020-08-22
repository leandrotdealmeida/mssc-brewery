package com.japa.msscbrewery.services;

import com.japa.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);

    CustomerDto getCustomerByName(String customerName);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deteleCustomerById(UUID customerId);
}
