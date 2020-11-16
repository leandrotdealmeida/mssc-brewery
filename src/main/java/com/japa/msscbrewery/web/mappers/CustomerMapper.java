package com.japa.msscbrewery.web.mappers;

import com.japa.msscbrewery.domain.Customer;
import com.japa.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
