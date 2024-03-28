package com.system.hotelmanagement.controller;

import com.system.hotelmanagement.model.RoomType;
import com.system.hotelmanagement.service.RoomTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room-type")
@CrossOrigin("*")
public class RoomTypeController {
    private final RoomTypeService roomTypeService;

    public RoomTypeController(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }

    @GetMapping
    List<RoomType> getAllRoomTypes(){
        return roomTypeService.getAllRoomTypes();
    }

    @GetMapping("/{id}")
    public Optional<RoomType> getRoomTypeById(@PathVariable Long id){
        return roomTypeService.getRoomTypeById(id);
    }

    @PostMapping
    public RoomType createRoomType(@RequestBody RoomType roomType){
        return roomTypeService.createRoomType(roomType);
    }

    @PutMapping("/id")
    RoomType updateRoomType(@PathVariable Long id, @RequestBody RoomType roomType){
        return roomTypeService.updateRoomType(id, roomType);
    }

    @DeleteMapping("/{id}")
    void deleteRoomType(@PathVariable Long id){
        roomTypeService.deleteRoomType(id);
    }
}
