package com.booking.booking;

import com.booking.customer.Customer;
import com.booking.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final CustomerRepository customerRepository;
    private final BookingRepository bookingRepository;

    public BookingService(final CustomerRepository customerRepository,
                          final BookingRepository bookingRepository) {
        this.customerRepository = customerRepository;
        this.bookingRepository = bookingRepository;
    }

    public void reserve(final Booking pBooking){
        final var customerOptional = customerRepository
                .findBy(pBooking.getCustomer().getEmail());

        customerOptional.ifPresentOrElse(customer -> bookingRepository.save(
                Booking.builder()
                        .customer(customer)
                        .hotelUuid(pBooking.getHotelUuid())
                        .build()),
                ()-> {
            final var customer = customerRepository.save(pBooking.getCustomer());
            final var booking = Booking.builder()
                    .hotelUuid(pBooking.getHotelUuid())
                    .customer(customer)
                    .build();
            bookingRepository.save(booking);
        });
    }
}
