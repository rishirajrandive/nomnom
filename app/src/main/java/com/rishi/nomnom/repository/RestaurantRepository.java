package com.rishi.nomnom.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.rishi.nomnom.model.Restaurant;
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
 * Repo for restaurants
 * Kind of cache is implemented here, it works because location is always same
 * But for future this could be improved to be better.
 */

public class RestaurantRepository {

    private static final String TAG = RestaurantRepository.class.getSimpleName();
    private static final String GOOGLE_PLACES_KEY = "AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk";
    private WebService mWebService;
    private LiveData<List<Restaurant>> mRestaurantsLiveData;
    private Map<String, LiveData<List<Restaurant>>> mCache;

    @Inject
    public RestaurantRepository(WebService webservice) {
        this.mWebService = webservice;
        mCache = new HashMap<>();
    }

    public LiveData<List<Restaurant>> getRestaurants(String location) {
        if(!mCache.containsKey(location)) {
            fetchRestaurants(location);
        }
        return mRestaurantsLiveData;
    }

    public void fetchRestaurants(String location) {
        Map<String, String> params = new HashMap<>();
        params.put(Constants.PARAM_LOCATION, location);
        params.put(Constants.PARAM_RADIUS, "500");
        params.put(Constants.PARAM_TYPE, "restaurant");
        params.put(Constants.PARAM_KEY, GOOGLE_PLACES_KEY);
        final MutableLiveData<List<Restaurant>> restaurantsLiveData = new MutableLiveData<>();

        mWebService.getRestaurants(params)
                .observeOn(Schedulers.io())
                .map(apiResponse -> {
                    NetworkResponseParser parser = new NetworkResponseParser();
                    return parser.getRestaurants(apiResponse);
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurantsLiveData::setValue);
        mRestaurantsLiveData = restaurantsLiveData;
        mCache.put(location, mRestaurantsLiveData);
    }

    public LiveData<Restaurant> getRestaurantDetail(String placeId) {
        Map<String, String> params = new HashMap<>(2);
        params.put(Constants.PARAM_KEY, GOOGLE_PLACES_KEY);
        params.put(Constants.PARAM_PLACE_ID, placeId);

        final MutableLiveData<Restaurant> restaurantDetailLiveData = new MutableLiveData<>();

        mWebService.getRestaurantDetail(params)
                .observeOn(Schedulers.io())
                .map(response -> {
                    NetworkResponseParser parser = new NetworkResponseParser();
                    return parser.getRestaurantDetail(response);
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(restaurantDetailLiveData::setValue);
        return restaurantDetailLiveData;
    }
}
