package com.booking.booking;

import com.booking.customer.CustomerRepository;

public class BookingService {

    private final CustomerRepository customerRepository;
    private final BookingRepository bookingRepository;

    public BookingService(final CustomerRepository customerRepository,
                          final BookingRepository bookingRepository) {
        this.customerRepository = customerRepository;
        this.bookingRepository = bookingRepository;
    }

    public void reserve(final Booking booking){
        customerRepository.findBy(booking.getCustomer().getEmail())
                .ifPresentOrElse(customer -> bookingRepository.save(Booking.builder()
                                .hotelUuid(booking.getHotelUuid())
                                .customer(customer)
                        .build()), ()->{

                    customerRepository.save(booking.getCustomer());
                    bookingRepository.save(Booking.builder()
                            .hotelUuid(booking.getHotelUuid())
                            .customer(customer));
                });
    }
}
