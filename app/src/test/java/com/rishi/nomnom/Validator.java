package com.rishi.nomnom;

import com.rishi.nomnom.model.OpenHours;
import com.rishi.nomnom.model.Photo;
import com.rishi.nomnom.model.RestaurantTile;
import com.rishi.nomnom.model.Review;

import org.junit.Assert;

/**
 * Created by rishi on 10/6/17.
 */

public class Validator {

    static void verifyFirstRestaurant(RestaurantTile restaurantTile) {
        Assert.assertEquals(restaurantTile.getId(), "112226e5b074c6d767041d2761863c550d8a5f26");
        Assert.assertEquals(restaurantTile.getName(), "Zuni Café.");
        Assert.assertEquals(restaurantTile.getPlaceId(), "ChIJO7u9q5-AhYARiSSXyWv9eJ8");
        Assert.assertNull(restaurantTile.getRestaurantDetail());
        verifyFirstOpenHours(restaurantTile.getOpenHours());

        Assert.assertEquals(restaurantTile.getPhoto().size(), 1);
        verifyFirstPhoto(restaurantTile.getPhoto().get(0));

        Assert.assertNotNull(restaurantTile.getGeometry());
        Assert.assertNotNull(restaurantTile.getGeometry().getLocation());

        Assert.assertEquals(restaurantTile.getGeometry().getLocation().getLatitude(), 37.7736262, 0);
        Assert.assertEquals(restaurantTile.getGeometry().getLocation().getLongitude(), -122.421645, 0);
    }

    private static void verifyFirstOpenHours(OpenHours openHours) {
        Assert.assertEquals(openHours.isOpenNow(), true);
    }

    private static void verifyFirstPhoto(Photo photo) {
        Assert.assertEquals(photo.getPhotoRef(), "CmRaAAAAi8thfGP1CT0-RTWLN-BdOQi91lvoL7cnbwk2PftcnbJLkgHnuayXCs9ddQ-GO69tpWfKlefA8icPJkaoyO1VcIEFddWthBMwHrB_18zp3xVgCe3Qn_bnHK2YoYELSnzkEhBahVYWzXrMSHfyorx1lVJqGhQAHSbKHN_rPotmh0qXeaRsTWd8mA");
        Assert.assertEquals(photo.getPhotoUrl(), "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&key=AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk&photo_reference=CmRaAAAAi8thfGP1CT0-RTWLN-BdOQi91lvoL7cnbwk2PftcnbJLkgHnuayXCs9ddQ-GO69tpWfKlefA8icPJkaoyO1VcIEFddWthBMwHrB_18zp3xVgCe3Qn_bnHK2YoYELSnzkEhBahVYWzXrMSHfyorx1lVJqGhQAHSbKHN_rPotmh0qXeaRsTWd8mA");
    }

    static void verifySecondRestaurant(RestaurantTile restaurantTile) {
        Assert.assertEquals(restaurantTile.getId(), "2f06454d3f2021df376d7a49c82bbd4298e0694d");
        Assert.assertEquals(restaurantTile.getName(), "Rich Table");
        Assert.assertEquals(restaurantTile.getPlaceId(), "ChIJh_24QJ-AhYAR_xbUNVN2Xns");
        Assert.assertNull(restaurantTile.getRestaurantDetail());
        verifySecondOpenHours(restaurantTile.getOpenHours());

        Assert.assertEquals(restaurantTile.getPhoto().size(), 1);
        verifySecondPhoto(restaurantTile.getPhoto().get(0));

        Assert.assertNotNull(restaurantTile.getGeometry());
        Assert.assertNotNull(restaurantTile.getGeometry().getLocation());

        Assert.assertEquals(restaurantTile.getGeometry().getLocation().getLatitude(), 37.7749041, 0);
        Assert.assertEquals(restaurantTile.getGeometry().getLocation().getLongitude(), -122.4227357, 0);
    }

    private static void verifySecondOpenHours(OpenHours openHours) {
        Assert.assertEquals(openHours.isOpenNow(), false);
    }

    private static void verifySecondPhoto(Photo photo) {
        Assert.assertEquals(photo.getPhotoRef(), "CmRaAAAATQzRV8lCYaAfDjRtxvSfELCwdVJO13p-3W6msTK5YVoJ8Wdea1KL_17h2t0zOkx2Wnm73gbxPv5t8TKQSmAxXcBE_XQkfaoQBW898o7C0VAu8gHVRyo1zcvaYjmaLPQqEhDsM1tnqo62iVL-M2Hq_NeRGhRM2HSoRNrN0DkqKlrCvZXMLtIrvA");
        Assert.assertEquals(photo.getPhotoUrl(), "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&key=AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk&photo_reference=CmRaAAAATQzRV8lCYaAfDjRtxvSfELCwdVJO13p-3W6msTK5YVoJ8Wdea1KL_17h2t0zOkx2Wnm73gbxPv5t8TKQSmAxXcBE_XQkfaoQBW898o7C0VAu8gHVRyo1zcvaYjmaLPQqEhDsM1tnqo62iVL-M2Hq_NeRGhRM2HSoRNrN0DkqKlrCvZXMLtIrvA");
    }

    static void verifyDetailOpenHours(OpenHours openHours) {
        Assert.assertEquals(openHours.getWeekdayText().size(), 7);
        Assert.assertEquals(openHours.getWeekdayText().get(0), "Monday: Closed");
        Assert.assertEquals(openHours.getWeekdayText().get(6), "Sunday: 11:00 AM – 11:00 PM");
    }

    static void verifyDetailPhoto(Photo photo) {
        Assert.assertEquals(photo.getPhotoRef(), "CmRaAAAAQGEmXBJ8vBC4P9tJlpl-zwd7TzALRS7iUlGKWXQ-EKti2aWVC_XNd3kZ7fyqlKcb7qIcsMnJXZ85pXfTljjqVSCBLLZILvkDdEPr1voNcYK1w-C1OX1gHYsUZm_q5CL4EhCBn61UyTQN3-n3FuUZXEJRGhS7a9QQseZz9TVPfKaeURz9CgQsug");
        Assert.assertEquals(photo.getPhotoUrl(), "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&key=AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk&photo_reference=CmRaAAAAQGEmXBJ8vBC4P9tJlpl-zwd7TzALRS7iUlGKWXQ-EKti2aWVC_XNd3kZ7fyqlKcb7qIcsMnJXZ85pXfTljjqVSCBLLZILvkDdEPr1voNcYK1w-C1OX1gHYsUZm_q5CL4EhCBn61UyTQN3-n3FuUZXEJRGhS7a9QQseZz9TVPfKaeURz9CgQsug");
    }

    static void verifyFirstReview(Review review) {
        Assert.assertEquals(review.getAuthorName(), "Michelle Vu");
        Assert.assertEquals(review.getTimeStamp(), 1505853918);
        Assert.assertEquals(review.getProfilePhotoUrl(), "https://lh3.googleusercontent.com/-XbHClCJDyGI/AAAAAAAAAAI/AAAAAAAAJUc/g5mlEzGJkJY/s128-c0x00000000-cc-rp-mo-ba3/photo.jpg");
    }
}
