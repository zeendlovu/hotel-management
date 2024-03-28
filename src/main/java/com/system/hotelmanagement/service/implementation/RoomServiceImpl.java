package com.system.hotelmanagement.service.implementation;

import com.system.hotelmanagement.model.Room;
import com.system.hotelmanagement.repository.RoomRepository;
import com.system.hotelmanagement.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room updateRoom(Long id, Room room) {
        Room updateToRoom = roomRepository.findById(id).orElseThrow();
        updateToRoom.setRoomNumber(room.getRoomNumber());
        updateToRoom.setRoomType(room.getRoomType());
        return roomRepository.save(updateToRoom);
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
