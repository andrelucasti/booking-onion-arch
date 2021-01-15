package com.booking.hotel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HotelDTO  {
    private String name;
    private String description;

    public HotelDTO(@JsonProperty("name") final String name,
                    @JsonProperty("description") final String description) {
        this.name = name;
        this.description = description;
    }
}
