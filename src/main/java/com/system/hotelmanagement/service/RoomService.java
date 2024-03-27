package com.system.hotelmanagement.service;

import com.system.hotelmanagement.model.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<Room> getAllRooms();
    public Optional<Room> getRoomById(Long id);
    public Room createRoom(Room room);
    Room updateRoom(Long id, Room room);
    void deleteRoom(Long id);
}
