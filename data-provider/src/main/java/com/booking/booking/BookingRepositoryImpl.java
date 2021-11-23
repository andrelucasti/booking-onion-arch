package com.booking.booking;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepositoryImpl implements BookingRepository{

    private final ConversionService conversionService;
    private final BookingRepositoryEntity bookingRepositoryEntity;

    public BookingRepositoryImpl(final ConversionService conversionService,
                                 final BookingRepositoryEntity bookingRepositoryEntity) {
        this.conversionService = conversionService;
        this.bookingRepositoryEntity = bookingRepositoryEntity;
    }

    @Override
    public void save(final Booking booking) {
        final var bookingEntity = conversionService.convert(booking, BookingEntity.class);
        bookingRepositoryEntity.save(bookingEntity);
    }
}
