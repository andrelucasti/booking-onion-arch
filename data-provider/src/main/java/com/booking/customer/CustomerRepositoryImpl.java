package com.booking.customer;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    private final CustomerRepositoryEntity customerRepositoryEntity;
    private final ConversionService conversionService;

    public CustomerRepositoryImpl(final CustomerRepositoryEntity customerRepositoryEntity,
                                  final ConversionService conversionService) {
        this.customerRepositoryEntity = customerRepositoryEntity;
        this.conversionService = conversionService;
    }

    @Override
    public void save(final Customer customer) {
        final var customerEntity = conversionService.convert(customer, CustomerEntity.class);
        customerRepositoryEntity.save(customerEntity);
    }
}
