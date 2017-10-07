package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantTile {
    @SerializedName("id")
    @Expose
    private String mId;
    @SerializedName("icon")
    @Expose
    private String mPlaceholderIcon;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("place_id")
    @Expose
    private String mPlaceId;
    @SerializedName("price_level")
    @Expose
    private int mPriceLevel;
    @SerializedName("rating")
    @Expose
    private float mRatings;
    @SerializedName("vicinity")
    @Expose
    private String mVicinity;
    @SerializedName("opening_hours")
    @Expose
    private OpenHours mOpenHours;
    @SerializedName("photos")
    @Expose
    private List<Photo> mPhoto;
    @SerializedName("geometry")
    @Expose
    private Geometry mGeometry;

    private RestaurantDetail mRestaurantDetail;

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getPlaceholderIcon() {
        return mPlaceholderIcon;
    }

    public void setPlaceholderIcon(String mPlaceholderIcon) {
        this.mPlaceholderIcon = mPlaceholderIcon;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public List<Photo> getPhoto() {
        return mPhoto;
    }

    public void setPhoto(List<Photo> mPhoto) {
        this.mPhoto = mPhoto;
    }

    public String getPlaceId() {
        return mPlaceId;
    }

    public void setPlaceId(String mPlaceId) {
        this.mPlaceId = mPlaceId;
    }

    public int getPriceLevel() {
        return mPriceLevel;
    }

    public void setPriceLevel(int mPriceLevel) {
        this.mPriceLevel = mPriceLevel;
    }

    public float getRatings() {
        return mRatings;
    }

    public void setRatings(float mRatings) {
        this.mRatings = mRatings;
    }

    public String getVicinity() {
        return mVicinity;
    }

    public void setVicinity(String mVicinity) {
        this.mVicinity = mVicinity;
    }

    public OpenHours getOpenHours() {
        return mOpenHours;
    }

    public void setOpenHours(OpenHours mOpenHours) {
        this.mOpenHours = mOpenHours;
    }

    public Geometry getGeometry() {
        return mGeometry;
    }

    public void setGeometry(Geometry mGeometry) {
        this.mGeometry = mGeometry;
    }

    public RestaurantDetail getRestaurantDetail() {
        return mRestaurantDetail;
    }

    public void setRestaurantDetail(RestaurantDetail mRestaurantDetail) {
        this.mRestaurantDetail = mRestaurantDetail;
    }
}
