package com.booking.booking;

import com.booking.customer.Customer;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class Booking {
    private UUID hotelUuid;
    private Customer customer;
}
