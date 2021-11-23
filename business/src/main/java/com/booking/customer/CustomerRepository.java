package com.booking.customer;

import java.util.Optional;

public interface CustomerRepository {

    Customer save(Customer customer);

    Optional<Customer> findBy(String email);
}
