package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rishi on 10/6/17.
 */

public class Photo {
    private static final String BASE_URL = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&key=AIzaSyB-bpw0ollWA5AKpT11Y2CL2qPFs4kC_dk&photo_reference=";
    @SerializedName("photo_reference")
    @Expose
    private String mPhotoRef;
    private String mPhotoUrl;

    public String getPhotoRef() {
        return mPhotoRef;
    }

    public void setPhotoRef(String mPhotoRef) {
        this.mPhotoRef = mPhotoRef;
    }

    public String getPhotoUrl() {
        mPhotoUrl = (getPhotoRef() != null) ? (BASE_URL + getPhotoRef()) : null;
        return mPhotoUrl;
    }

    public void setPhotoUrl(String mPhotoUrl) {
        this.mPhotoUrl = mPhotoUrl;
    }
}
