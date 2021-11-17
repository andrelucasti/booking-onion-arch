package com.booking.customer.converter;

import com.booking.customer.Customer;
import com.booking.customer.CustomerEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CustomerToCustomerEntity implements Converter<Customer, CustomerEntity> {

    private final ConfigurableConversionService conversionService;

    public CustomerToCustomerEntity(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public CustomerEntity convert(final Customer customer) {
        return CustomerEntity.of(customer.getName(), customer.getEmail());
    }
}
