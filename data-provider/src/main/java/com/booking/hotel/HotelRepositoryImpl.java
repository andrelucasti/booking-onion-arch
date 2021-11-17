package com.booking.hotel;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepositoryImpl implements HotelRepository{

    private final HotelRepositoryEntity hotelRepositoryEntity;
    private final ConversionService conversionService;

    public HotelRepositoryImpl(final HotelRepositoryEntity hotelRepositoryEntity,
                               final ConversionService conversionService) {
        this.hotelRepositoryEntity = hotelRepositoryEntity;
        this.conversionService = conversionService;
    }

    @Override
    public void save(final Hotel hotel) {
        final var hotelEntity = conversionService.convert(hotel, HotelEntity.class);
        hotelRepositoryEntity.save(hotelEntity);
    }
}
