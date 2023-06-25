package com.Restaurant.RestaurantList.model;

import lombok.Data;

@Data
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String specialty;
    private Long totalStaff;


}



