package com.booking.customer;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class Customer {
    private UUID uuid;
    private String name;
    private String email;
}
