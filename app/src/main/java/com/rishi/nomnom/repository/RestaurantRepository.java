package com.rishi.nomnom.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.rishi.nomnom.model.RestaurantDetail;
import com.rishi.nomnom.model.RestaurantTile;
import com.rishi.nomnom.network.NetworkResponseParser;
import com.rishi.nomnom.network.WebService;
import com.rishi.nomnom.util.Constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantRepository {

    private static final String TAG = RestaurantRepository.class.getSimpleName();
    private static final String GOOGLE_PLACES_KEY = "AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk";
    private WebService mWebService;

    @Inject
    public RestaurantRepository(WebService webservice) {
        this.mWebService = webservice;
    }

    public LiveData<List<RestaurantTile>> getRestaurants(Map<String, String> params) {
        params.put(Constants.PARAM_KEY, GOOGLE_PLACES_KEY);
        final MutableLiveData<List<RestaurantTile>> restaurantsLiveData = new MutableLiveData<>();

        mWebService.getRestaurants(params)
                .observeOn(Schedulers.io())
                .map(apiResponse -> {
                    NetworkResponseParser parser = new NetworkResponseParser();
                    List<RestaurantTile> restaurants = parser.getRestaurants(apiResponse);
                    return restaurants;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurants -> {
                    restaurantsLiveData.setValue(restaurants);
                });
        return restaurantsLiveData;
    }

    public LiveData<RestaurantDetail> getRestaurantDetail(String placeId) {
        Map<String, String> params = new HashMap<>(2);
        params.put(Constants.PARAM_KEY, GOOGLE_PLACES_KEY);
        params.put(Constants.PARAM_PLACE_ID, placeId);

        final MutableLiveData<RestaurantDetail> restaurantDetailLiveData = new MutableLiveData<>();

        mWebService.getRestaurantDetail(params)
                .observeOn(Schedulers.io())
                .map(response -> {
                    NetworkResponseParser parser = new NetworkResponseParser();
                    return parser.getRestaurantDetail(response);
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurantDetail -> {
                   restaurantDetailLiveData.setValue(restaurantDetail);
                });
        return restaurantDetailLiveData;
    }
}
