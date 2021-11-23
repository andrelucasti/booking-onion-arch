package com.booking.customer;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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
    public Customer save(final Customer customer) {
        final var customerEntity = conversionService.convert(customer, CustomerEntity.class);
        final var customerSaved = customerRepositoryEntity.save(customerEntity);

        return conversionService.convert(customerSaved, Customer.class);
    }

    @Override
    public Optional<Customer> findBy(final String email) {
        return customerRepositoryEntity.findByEmail(email)
                .map(customerEntity -> conversionService.convert(customerEntity, Customer.class));
    }
}
