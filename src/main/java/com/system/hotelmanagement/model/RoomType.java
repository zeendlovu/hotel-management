package com.system.hotelmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomType_id;

    private String name;
    private double price;
    private int bed_capacity;
    private String view;
}
