package com.system.hotelmanagement.service;

import com.system.hotelmanagement.model.Room;
import com.system.hotelmanagement.model.RoomType;

import java.util.List;
import java.util.Optional;

public interface RoomTypeService {
    List<Room> getAllRoomTypes();
    public Optional<RoomType> getRoomTypeById(Long id);
    public Room createRoomType(Room room);
    Room updateRoomType(Long id, Room room);
    void deleteRoomType(Long id);
}
