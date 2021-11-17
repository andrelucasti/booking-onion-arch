package com.booking.customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    void save(Customer customer);

    Optional<Customer> findBy(String email);
}
