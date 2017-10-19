package com.rishi.nomnom.network;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by rishi on 10/6/17.
 *
 * Endpoints for the APIs we are using in app
 */

public interface WebService {
    @GET("/maps/api/place/nearbysearch/json")
    Observable<ApiResponse> getRestaurants(@QueryMap Map<String, String> params);

    @GET("/maps/api/place/details/json")
    Observable<ApiResponse> getRestaurantDetail(@QueryMap Map<String, String> params);

    @GET("/maps/api/place/nearbysearch/json")
    Observable<ApiResponse> getNextPageRestaurants(@Query("pagetoken") String pageToken, @Query("key") String key);
}
