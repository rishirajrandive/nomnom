package com.rishi.nomnom.network;

import com.rishi.nomnom.MockResponseStore;
import com.rishi.nomnom.Validator;
import com.rishi.nomnom.model.Restaurant;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NetworkResponseParserTest {

    @Test
    public void testRestaurantListParser() {
        NetworkResponseParser networkResponseParser = new NetworkResponseParser();
        List<Restaurant> restaurants = networkResponseParser.getRestaurants(MockResponseStore.getMockRestaurants());
        Assert.assertEquals(restaurants.size(), 2);
        Validator.verifyFirstRestaurant(restaurants.get(0));
        Validator.verifySecondRestaurant(restaurants.get(1));
    }

}