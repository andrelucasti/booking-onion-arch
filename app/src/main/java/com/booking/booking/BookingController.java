package com.booking.booking;

import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;
    private final ConversionService conversionService;

    public BookingController(final BookingService bookingService,
                             final ConversionService conversionService) {
        this.bookingService = bookingService;
        this.conversionService = conversionService;
    }

    @PostMapping("/reserve")
    public void reserveNewBooking(@RequestBody final BookingDTO bookingDTO){
        final var booking = conversionService.convert(bookingDTO, Booking.class);
        bookingService.reserve(booking);
    }
}
