package com.booking.customer.converter;

import com.booking.customer.Customer;
import com.booking.customer.CustomerEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CustomerEntityToCustomer implements Converter<CustomerEntity, Customer> {

    private final ConfigurableConversionService conversionService;

    public CustomerEntityToCustomer(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public Customer convert(final CustomerEntity customerEntity) {
        return Customer.builder()
                .uuid(customerEntity.getUuid())
                .name(customerEntity.getName())
                .email(customerEntity.getEmail())
                .build();
    }
}
