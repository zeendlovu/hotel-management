package com.system.hotelmanagement.repository;

import com.system.hotelmanagement.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
