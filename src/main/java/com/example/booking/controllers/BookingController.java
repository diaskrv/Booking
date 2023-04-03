package com.example.booking.controllers;

import com.example.booking.domain.Booking;
import com.example.booking.domain.Cabinet;
import com.example.booking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class BookingController {

    private BookingService bookingService;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @GetMapping("/booking")
    public List<Booking> getCabinetsInfo(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/booking/peoples/{peoplenumber}")
    public ResponseEntity<Booking> bookingPeopleNumber(@PathVariable int peoplenumber) {
        return ResponseEntity.ok(bookingService.getBookingByPeopleNumber(peoplenumber));
    }

    @GetMapping("/booking/{cabinet}/{user}")
    public ResponseEntity<Booking> bookingCabinetUser(@PathVariable int cabinet, @PathVariable int user) {
        return ResponseEntity.ok(bookingService.getBookingByCabinetAndUser(cabinet, user));
    }
}
