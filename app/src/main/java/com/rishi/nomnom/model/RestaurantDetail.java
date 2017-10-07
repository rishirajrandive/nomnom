package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantDetail {
    @SerializedName("formatted_address")
    @Expose
    private String mFormattedAddress;
    @SerializedName("formatted_phone_number")
    @Expose
    private String mFormattedPhone;
    @SerializedName("url")
    @Expose
    private String mGoogleMapUrl;
    @SerializedName("website")
    @Expose
    private String mWebsiteUrl;
    @SerializedName("reviews")
    @Expose
    private List<Review> mReviews;
    @SerializedName("opening_hours")
    @Expose
    private OpenHours mOpenHours;
    @SerializedName("photos")
    @Expose
    private List<Photo> mPhotoList;

    public String getFormattedAddress() {
        return mFormattedAddress;
    }

    public void setFormattedAddress(String mFormattedAddress) {
        this.mFormattedAddress = mFormattedAddress;
    }

    public String getFormattedPhone() {
        return mFormattedPhone;
    }

    public void setFormattedPhone(String mFormattedPhone) {
        this.mFormattedPhone = mFormattedPhone;
    }

    public OpenHours getOpenHours() {
        return mOpenHours;
    }

    public void setOpenHours(OpenHours mOpenHours) {
        this.mOpenHours = mOpenHours;
    }

    public List<Photo> getPhotoList() {
        return mPhotoList;
    }

    public void setPhotoList(List<Photo> mPhotoList) {
        this.mPhotoList = mPhotoList;
    }

    public String getGoogleMapUrl() {
        return mGoogleMapUrl;
    }

    public void setGoogleMapUrl(String mGoogleMapUrl) {
        this.mGoogleMapUrl = mGoogleMapUrl;
    }

    public List<Review> getReviews() {
        return mReviews;
    }

    public void setReviews(List<Review> mReviews) {
        this.mReviews = mReviews;
    }

    public String getWebsiteUrl() {
        return mWebsiteUrl;
    }

    public void setWebsiteUrl(String mWebsiteUrl) {
        this.mWebsiteUrl = mWebsiteUrl;
    }
}
