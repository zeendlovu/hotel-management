package com.system.hotelmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long room_id;

    private int roomNumber;

    @ManyToOne
    @JoinColumn(name = "roomType_id")
    private RoomType roomType;


}
