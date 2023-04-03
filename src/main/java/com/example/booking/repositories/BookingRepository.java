package com.example.booking.repositories;

import com.example.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    List<Booking> findAll();
    Optional<Booking> findByPeoplenumber(Integer number);
    Optional<Booking> findByCabinetAndUser(Integer cabinet, Integer user);
}
