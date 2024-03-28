package com.system.hotelmanagement.service.implementation;

import com.system.hotelmanagement.model.Booking;
import com.system.hotelmanagement.repository.BookingRepository;
import com.system.hotelmanagement.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public Booking updateBooking(Long id, Booking booking) {
        Booking updateToBooking = bookingRepository.findById(id).orElseThrow();
        updateToBooking.setCheckIn(booking.getCheckIn());
        updateToBooking.setCheckOut(booking.getCheckOut());
        updateToBooking.setCustomer(booking.getCustomer());
        updateToBooking.setRoomType(booking.getRoomType());
        return null;
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
