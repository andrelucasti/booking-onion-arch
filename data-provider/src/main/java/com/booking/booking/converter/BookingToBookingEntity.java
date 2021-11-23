package com.booking.booking.converter;

import com.booking.booking.Booking;
import com.booking.booking.BookingEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BookingToBookingEntity implements Converter<Booking, BookingEntity> {

    private final ConfigurableConversionService conversionService;

    public BookingToBookingEntity(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public BookingEntity convert(final Booking booking) {
        return BookingEntity.of(booking.getHotelUuid(), booking.getCustomer().getUuid());
    }
}
