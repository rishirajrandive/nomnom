package com.rishi.nomnom.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.rishi.nomnom.model.RestaurantDetail;
import com.rishi.nomnom.model.RestaurantTile;
import com.rishi.nomnom.repository.RestaurantRepository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantViewModel extends ViewModel {
    private LiveData<List<RestaurantTile>> mRestaurants;
    private LiveData<RestaurantDetail> mRestaurantDetail;
    private RestaurantRepository mRestaurantRepository;

    @Inject
    public RestaurantViewModel(RestaurantRepository restaurantRepository){
        mRestaurantRepository = restaurantRepository;
    }

    public LiveData<List<RestaurantTile>> getRestaurants(Map<String, String> params){
        return mRestaurantRepository.getRestaurants(params);
    }

    public LiveData<RestaurantDetail> getRestaurantDetail(String placeId) {
        return mRestaurantRepository.getRestaurantDetail(placeId);
    }
}
