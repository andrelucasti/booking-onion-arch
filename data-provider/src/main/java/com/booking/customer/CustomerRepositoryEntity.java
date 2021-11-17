package com.booking.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepositoryEntity extends JpaRepository<CustomerEntity, UUID> {
}
