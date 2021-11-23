package com.booking.booking;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "BOOKING")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
@Getter
public class BookingEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;

    @Column(name = "HOTEL_UUID", nullable = false)
    @NonNull
    private UUID hotelUUID;

    @Column(name = "CUSTOMER_UUID", nullable = false)
    @NonNull
    private UUID customerUUID;
}
