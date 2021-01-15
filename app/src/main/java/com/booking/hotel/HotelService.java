package com.booking.hotel;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;
    private final ConversionService conversionService;

    public HotelService(final HotelRepository hotelRepository,
                        final ConversionService conversionService) {
        this.hotelRepository = hotelRepository;
        this.conversionService = conversionService;
    }

    public void save(final HotelDTO hotelDTO){
        final var hotel = conversionService.convert(hotelDTO, Hotel.class);
        hotelRepository.save(hotel);
    }
}
