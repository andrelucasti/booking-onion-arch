package com.booking.hotel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private HotelService hotelService;

    public HotelController(final HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping()
    private void newHotel(@RequestBody final HotelDTO hotelDTO){
        hotelService.save(hotelDTO);
    }
}
