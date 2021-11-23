package com.booking.booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingRepositoryEntity extends JpaRepository<BookingEntity, UUID> {
}
