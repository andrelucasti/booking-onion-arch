package com.booking.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomerDTO {
    private String name;
    private String email;

    public CustomerDTO(@JsonProperty("name") final String name,
                       @JsonProperty(value = "email", required = true) final String email) {
        this.name = name;
        this.email = email;
    }
}
