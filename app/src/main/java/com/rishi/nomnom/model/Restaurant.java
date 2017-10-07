package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class Restaurant {
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
    @SerializedName("reviews")
    @Expose
    private List<Review> mReviews;
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

    public List<Photo> getPhotoList() {
        return mPhoto;
    }

    public void setPhotoList(List<Photo> mPhoto) {
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

    public List<Review> getReviews() {
        return mReviews;
    }

    public void setReviews(List<Review> mReviews) {
        this.mReviews = mReviews;
    }

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

    public String getGoogleMapUrl() {
        return mGoogleMapUrl;
    }

    public void setGoogleMapUrl(String mGoogleMapUrl) {
        this.mGoogleMapUrl = mGoogleMapUrl;
    }

    public String getWebsiteUrl() {
        return mWebsiteUrl;
    }

    public void setWebsiteUrl(String mWebsiteUrl) {
        this.mWebsiteUrl = mWebsiteUrl;
    }
}
