package com.system.hotelmanagement.repository;

import com.system.hotelmanagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
