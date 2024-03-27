package com.system.hotelmanagement.service;

import com.system.hotelmanagement.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> getAllBookings();
    public Booking createBooking(Booking booking);
    public Optional<Booking> getBookingById(Long id);
    Booking updateBooking(Long id, Booking booking);
    void deleteBooking(Long id);
}
