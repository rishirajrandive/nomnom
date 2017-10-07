package com.rishi.nomnom.network;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.rishi.nomnom.model.RestaurantDetail;
import com.rishi.nomnom.model.RestaurantTile;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class NetworkResponseParser {
    private static final String TAG = NetworkResponseParser.class.getSimpleName();

    public List<RestaurantTile> getRestaurants(ApiResponse response) {
        if(!response.getStatus().equals("OK")){
            Log.d(TAG, "Status Code: " + response.getStatus() + " Returning empty list.");
            return new ArrayList<>();
        }

        JsonElement results = response.getResults();
        Log.d(TAG, "Response data "+ results);
        Type targetClassType = new TypeToken<List<RestaurantTile>>(){}.getType();
        List<RestaurantTile> targetCollection = new Gson().fromJson(results, targetClassType);

        return targetCollection;
    }

    public RestaurantDetail getRestaurantDetail(ApiResponse response) {
        if(!response.getStatus().equals("OK")){
            Log.d(TAG, "Status Code: " + response.getStatus() + " Returning NULL");
            return null;
        }

        JsonElement result = response.getResult();
        Log.d(TAG, "Response data "+ result);
        RestaurantDetail restaurantDetail = new Gson().fromJson(result, RestaurantDetail.class);

        return restaurantDetail;
    }
}
