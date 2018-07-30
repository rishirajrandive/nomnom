package com.rishi.nomnom.network;

import com.rishi.nomnom.MockResponseStore;
import com.rishi.nomnom.Validator;
import com.rishi.nomnom.model.Restaurant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NetworkResponseParserTest {

    private NetworkResponseParser networkResponseParser;

    @Before
    public void setup() {
        networkResponseParser = new NetworkResponseParser();
    }

    @Test
    public void testRestaurantListParser() {
        List<Restaurant> restaurants = networkResponseParser.getRestaurants(MockResponseStore.getMockRestaurants());
        Assert.assertEquals(restaurants.size(), 2);
        Validator.verifyFirstRestaurant(restaurants.get(0));
        Validator.verifySecondRestaurant(restaurants.get(1));
    }

    @Test
    public void testRestaurantDetailParser() {
        Restaurant restaurantDetail =
                networkResponseParser.getRestaurantDetail(MockResponseStore.getMockRestaurantDetails());
        Assert.assertNotNull(restaurantDetail);

        Assert.assertEquals(restaurantDetail.getFormattedAddress(), "1658 Market St, San Francisco, CA 94102, USA");
        Assert.assertEquals(restaurantDetail.getFormattedPhone(), "(415) 552-2522");
        Assert.assertEquals(restaurantDetail.getWebsiteUrl(), "http://www.zunicafe.com/");

        Assert.assertNotNull(restaurantDetail.getOpenHours());
        Validator.verifyDetailOpenHours(restaurantDetail.getOpenHours());

        Assert.assertEquals(restaurantDetail.getPhotoList().size(), 10);
        Validator.verifyDetailPhoto(restaurantDetail.getPhotoList().get(1)); // Just verifying one photo

        Assert.assertEquals(restaurantDetail.getReviews().size(), 5);
        Validator.verifyFirstReview(restaurantDetail.getReviews().get(0));
    }

}