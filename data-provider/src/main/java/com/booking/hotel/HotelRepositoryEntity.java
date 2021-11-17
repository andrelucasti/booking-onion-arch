package com.booking.hotel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HotelRepositoryEntity extends JpaRepository<HotelEntity, UUID> {

}
