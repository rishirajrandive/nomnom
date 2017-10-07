package com.rishi.nomnom.network;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.rishi.nomnom.model.Restaurant;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 10/6/17.
 *
 * Parses the API response as per need. Could be made generic
 */

public class NetworkResponseParser {
    private static final String TAG = NetworkResponseParser.class.getSimpleName();

    public List<Restaurant> getRestaurants(ApiResponse response) {
        if(!response.getStatus().equals("OK")){
            Log.d(TAG, "Status Code: " + response.getStatus() + " Returning empty list.");
            return new ArrayList<>();
        }

        JsonElement results = response.getResults();
        Log.d(TAG, "Response data "+ results);
        Type targetClassType = new TypeToken<List<Restaurant>>(){}.getType();
        List<Restaurant> targetCollection = new Gson().fromJson(results, targetClassType);

        return targetCollection;
    }

    public Restaurant getRestaurantDetail(ApiResponse response) {
        if(!response.getStatus().equals("OK")){
            Log.d(TAG, "Status Code: " + response.getStatus() + " Returning NULL");
            return null;
        }

        JsonElement result = response.getResult();
        Log.d(TAG, "Response data "+ result);
        Restaurant restaurantDetail = new Gson().fromJson(result, Restaurant.class);

        return restaurantDetail;
    }
}
