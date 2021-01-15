package com.booking.hotel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Hotel {
    private String name;
    private String description;
}
