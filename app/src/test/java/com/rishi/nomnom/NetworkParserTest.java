//package com.rishi.nomnom;
//
//import com.rishi.nomnom.model.Restaurant;
//import com.rishi.nomnom.network.ApiResponse;
//import com.rishi.nomnom.network.NetworkResponseParser;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.JUnit4;
//
//import java.util.List;
//
///**
// * Created by rishi on 10/6/17.
// * Tests for parsing of JSON response and populating the models
// */
//
//@RunWith(JUnit4.class)
//public class NetworkParserTest {
//    private NetworkResponseParser networkResponseParser;
//
//    @Before
//    public void setup() {
//        networkResponseParser = new NetworkResponseParser();
//    }
//
//    @Test
//    public void testRestaurantsResponse() {
//        ApiResponse response = MockResponseStore.getMockRestaurants();
//        Assert.assertEquals(response.getStatus(),"OK");
//        Assert.assertNotNull(response.getResults());
//        Assert.assertEquals(response.getNextPageToken(), "CqQCGwEAAI87gNq3wZ43d_70SVL6S2KwyomUi7ZwRCTTWofU1x-Ys6PcaICqSO2FYGoT1NGtZ3Dn0-De0t8z8FN74oyHX9gA_YNfMmiDoyC6SnHKTe6-eMQJrL_E8H7YdcSyZH3Mco_AtWcAJ1USuhWYwI10rh0vlTYUOE5wu9LDBFTSi639MvZIEp6OCixH_WWx0OWqKtq2st1Z8EB451XE0tluUfmo5yBty2CApztzfWSSUi68bLiboTCVFyqhwHYCV7zg5xCY_Yi_AwG2G9YV6EROcsb4zUKcOw7mEeW8ZQaCf337e3FV_8iWx9S1y7t1zejle8mTLSAiw449Fv2I6rMq3oFcT_aAh36q0SDDipV_9DTFfY9YwVnHoxb73xBswoXG5RIQa0FesftDm3DWCLA7UGojzBoUnqZdtm-0RxSxCmqkGvaii8qWmVU");
//    }
//
//    @Test
//    public void testRestaurantDetailResponse() {
//        ApiResponse response = MockResponseStore.getMockRestaurantDetails();
//        Assert.assertEquals(response.getStatus(), "OK");
//        Assert.assertNull(response.getNextPageToken());
//    }
//
//    @Test
//    public void testNoResults() {
//        ApiResponse response = MockResponseStore.getMockNoResults();
//        Assert.assertEquals(response.getStatus(), "ZERO_RESULTS");
//    }
//
//    @Test
//    public void testRestaurantListParser() {
//        List<Restaurant> restaurants = networkResponseParser.getRestaurants(MockResponseStore.getMockRestaurants());
//        Assert.assertEquals(restaurants.size(), 2);
//        Validator.verifyFirstRestaurant(restaurants.get(0));
//        Validator.verifySecondRestaurant(restaurants.get(1));
//    }
//
//    @Test
//    public void testRestaurantDetailParser() {
//        Restaurant restaurantDetail = networkResponseParser.getRestaurantDetail(MockResponseStore.getMockRestaurantDetails());
//        Assert.assertNotNull(restaurantDetail);
//
//        Assert.assertEquals(restaurantDetail.getFormattedAddress(), "1658 Market St, San Francisco, CA 94102, USA");
//        Assert.assertEquals(restaurantDetail.getFormattedPhone(), "(415) 552-2522");
//        Assert.assertEquals(restaurantDetail.getWebsiteUrl(), "http://www.zunicafe.com/");
//
//        Assert.assertNotNull(restaurantDetail.getOpenHours());
//        Validator.verifyDetailOpenHours(restaurantDetail.getOpenHours());
//
//        Assert.assertEquals(restaurantDetail.getPhotoList().size(), 10);
//        Validator.verifyDetailPhoto(restaurantDetail.getPhotoList().get(1)); // Just verifying one photo
//
//        Assert.assertEquals(restaurantDetail.getReviews().size(), 5);
//        Validator.verifyFirstReview(restaurantDetail.getReviews().get(0));
//    }
//}
