package com.system.hotelmanagement.controller;

import com.system.hotelmanagement.model.Room;
import com.system.hotelmanagement.service.BookingService;
import com.system.hotelmanagement.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room")
@CrossOrigin("*")
public class RoomController {
    private final RoomService roomService;


    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Optional<Room> getRoomById(@PathVariable Long id){
        return roomService.getRoomById(id);
    }

    @PostMapping
    public Room createRoom(@RequestBody Room room){
        return roomService.createRoom(room);
    }

    @PutMapping("/{id}")
    Room updateRoom(@PathVariable Long id, @RequestBody Room room){
        return roomService.updateRoom(id, room);
    }

    @DeleteMapping("/{id}")
    void deleteRoom(@PathVariable Long id){
        roomService.deleteRoom(id);
    }

}
