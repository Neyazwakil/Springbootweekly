package com.Restaurant.RestaurantList.controller;

import com.Restaurant.RestaurantList.model.Restaurant;
import com.Restaurant.RestaurantList.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.findById(id);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.findAll();
    }

    @PostMapping
    public String addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.save(restaurant);
    }

    @PutMapping("/{id}")
    public String updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updatedRestaurant) {
        Restaurant restaurant = restaurantService.findById(id);
        if (restaurant != null) {
            restaurant.setSpecialty(updatedRestaurant.getSpecialty());

            return restaurantService.save(restaurant);
        }
        return "restaurant not found";
    }

    @DeleteMapping("/{id}")
    public String deleteRestaurant(@PathVariable Long id) {
        return restaurantService.delete(id);
    }
}