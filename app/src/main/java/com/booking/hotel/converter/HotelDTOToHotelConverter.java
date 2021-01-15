package com.booking.hotel.converter;


import com.booking.hotel.Hotel;
import com.booking.hotel.HotelDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HotelDTOToHotelConverter implements Converter<HotelDTO, Hotel> {

    private ConfigurableConversionService conversionService;

    public HotelDTOToHotelConverter(final ConfigurableConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostConstruct
    private void add(){
        conversionService.addConverter(this);
    }

    @Override
    public Hotel convert(final HotelDTO hotelDTO) {
        return Hotel.builder()
                .name(hotelDTO.getName())
                .description(hotelDTO.getDescription())
                .build();

    }
}
