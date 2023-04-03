package com.example.booking.services;

import com.example.booking.domain.Booking;
import com.example.booking.domain.Cabinet;
import com.example.booking.dto.BookingDTO;
import com.example.booking.dto.CabinetDTO;
import com.example.booking.repositories.BookingRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings(){
        List<Booking> bookingList = new ArrayList<>();
        bookingRepository.findAll().forEach(booking -> bookingList.add(booking));
        return bookingList;
    }
    public Booking getBookingByPeopleNumber(Integer number){
        return bookingRepository.findByPeoplenumber(number).orElse(null);
    }
    public Booking getBookingByCabinetAndUser(Integer cabinet, Integer user){
        return bookingRepository.findByCabinetAndUser(cabinet, user).orElse(null);
    }
}
