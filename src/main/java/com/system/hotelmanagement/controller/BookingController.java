package com.system.hotelmanagement.controller;

import com.system.hotelmanagement.model.Booking;
import com.system.hotelmanagement.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable Long id){
        return bookingService.getBookingById(id);
    }

    @PutMapping("/{id}")
    Booking updateBooking(@PathVariable Long id, @RequestBody Booking booking){
        return bookingService.updateBooking(id, booking);
    }

    @DeleteMapping("/{id}")
    void deleteBooking(@PathVariable Long id){
        bookingService.deleteBooking(id);
    }
}
