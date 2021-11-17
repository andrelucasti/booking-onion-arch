package com.booking.hotel.converter;

import com.booking.hotel.Hotel;
import com.booking.hotel.HotelEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HotelToHotelEntityConverter implements Converter<Hotel, HotelEntity> {

    private final ConfigurableConversionService conversionService;

    public HotelToHotelEntityConverter(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public HotelEntity convert(final Hotel hotel) {
        return HotelEntity.of(hotel.getName(), hotel.getDescription());
    }
}
