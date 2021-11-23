package com.booking.booking.converter;

import com.booking.booking.Booking;
import com.booking.booking.BookingDTO;
import com.booking.customer.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BookingDTOToBooking implements Converter<BookingDTO, Booking> {

    private final ConfigurableConversionService conversionService;

    public BookingDTOToBooking(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public Booking convert(final BookingDTO bookingDTO) {
        final var customer = Customer.builder()
                .name(bookingDTO.getCustomerDTO().getName())
                .email(bookingDTO.getCustomerDTO().getEmail())
                .build();

        return Booking.builder()
                .hotelUuid(bookingDTO.getHotelUUID())
                .customer(customer)
                .build();
    }
}
