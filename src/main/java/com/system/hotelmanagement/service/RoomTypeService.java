package com.system.hotelmanagement.service;

import com.system.hotelmanagement.model.Room;
import com.system.hotelmanagement.model.RoomType;

import java.util.List;
import java.util.Optional;

public interface RoomTypeService {
    List<RoomType> getAllRoomTypes();
    Optional<RoomType> getRoomTypeById(Long id);
    RoomType createRoomType(RoomType roomType);
    RoomType updateRoomType(Long id, RoomType roomType);
    void deleteRoomType(Long id);
}
