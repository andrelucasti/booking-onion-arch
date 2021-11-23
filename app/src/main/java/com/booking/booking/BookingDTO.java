package com.booking.booking;

import com.booking.customer.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class BookingDTO {
    private final UUID hotelUUID;
    private final CustomerDTO customerDTO;

    public BookingDTO(@JsonProperty(value = "hotelUUID", required = true) final UUID hotelUUID,
                      @JsonProperty("customer") final CustomerDTO customerDTO) {
        this.hotelUUID = hotelUUID;
        this.customerDTO = customerDTO;
    }
}


