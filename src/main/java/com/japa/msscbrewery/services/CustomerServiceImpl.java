package com.japa.msscbrewery.services;

import com.japa.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Japa")
                .build();

    }

    @Override
    public CustomerDto getCustomerByName(String customerName) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Japa")
                .id(UUID.randomUUID())
                .customerName("Leandro")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
       return CustomerDto.builder()
               .id(UUID.randomUUID())
               .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void deteleCustomerById(UUID customerId) {

    }
}
