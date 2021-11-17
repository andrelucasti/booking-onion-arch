package com.booking.customer;

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
@Table(name = "CUSTOMER")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
@Getter
public class CustomerEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;

    @Column(name = "NAME", nullable = false)
    @NonNull
    private String name;

    @Column(name = "EMAIL", nullable = false)
    @NonNull
    private String email;
}