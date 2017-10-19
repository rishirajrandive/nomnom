package com.rishi.nomnom.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.rishi.nomnom.model.Restaurant;
import com.rishi.nomnom.repository.RestaurantRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantViewModel extends ViewModel {
    private RestaurantRepository mRestaurantRepository;

    @Inject
    public RestaurantViewModel(RestaurantRepository restaurantRepository){
        mRestaurantRepository = restaurantRepository;
    }

    public LiveData<List<Restaurant>> getRestaurants(String location){
        return mRestaurantRepository.getRestaurants(location);
    }

    public void fetchRestaurants(String location){
        mRestaurantRepository.fetchRestaurants(location);
    }

    public LiveData<Restaurant> getRestaurantDetail(String placeId) {
        return mRestaurantRepository.getRestaurantDetail(placeId);
    }

    public LiveData<List<Restaurant>> getNextPageRestaurants(){
        return mRestaurantRepository.getNextPageRestaurants();
    }
}
