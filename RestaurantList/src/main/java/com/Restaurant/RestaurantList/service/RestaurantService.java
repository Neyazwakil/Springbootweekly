package com.Restaurant.RestaurantList.service;

import com.Restaurant.RestaurantList.model.Restaurant;
import com.Restaurant.RestaurantList.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant findById(Long id) {
        return restaurantRepository.findById(id);
    }

    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    public String save(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
        return "restraunt saved";
    }

    public String delete(Long id) {
        restaurantRepository.delete(id);
        return "Restaurant Deleted";
    }
}