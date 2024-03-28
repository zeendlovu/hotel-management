package com.system.hotelmanagement.service.implementation;

import com.system.hotelmanagement.model.RoomType;
import com.system.hotelmanagement.repository.RoomTypeRepository;
import com.system.hotelmanagement.service.RoomTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    @Override
    public Optional<RoomType> getRoomTypeById(Long id) {
        return roomTypeRepository.findById(id);
    }

    @Override
    public RoomType createRoomType(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }

    @Override
    public RoomType updateRoomType(Long id, RoomType roomType) {
        RoomType updateToRoomType = roomTypeRepository.findById(id).orElseThrow();
        updateToRoomType.setName(roomType.getName());
        updateToRoomType.setView(roomType.getView());
        updateToRoomType.setPrice(roomType.getPrice());
        updateToRoomType.setBed_capacity(roomType.getBed_capacity());
        return roomTypeRepository.save(updateToRoomType);
    }

    @Override
    public void deleteRoomType(Long id) {
        roomTypeRepository.deleteById(id);
    }
}
