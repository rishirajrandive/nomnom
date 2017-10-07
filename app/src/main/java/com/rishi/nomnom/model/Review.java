package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rishi on 10/6/17.
 */

public class Review {
    @SerializedName("author_name")
    @Expose
    private String mAuthorName;
    @SerializedName("author_url")
    @Expose
    private String mAuthorUrl;
    @SerializedName("profile_photo_url")
    @Expose
    private String mProfilePhotoUrl;
    @SerializedName("time")
    @Expose
    private long mTimeStamp;
    @SerializedName("rating")
    @Expose
    private float mRating;
    @SerializedName("text")
    @Expose
    private String mText;
    @SerializedName("relative_time_description")
    @Expose
    private String mRelativeTimeDesc;

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(String mAuthorName) {
        this.mAuthorName = mAuthorName;
    }

    public String getAuthorUrl() {
        return mAuthorUrl;
    }

    public void setAuthorUrl(String mAuthorUrl) {
        this.mAuthorUrl = mAuthorUrl;
    }

    public String getProfilePhotoUrl() {
        return mProfilePhotoUrl;
    }

    public void setProfilePhotoUrl(String mProfilePhotoUrl) {
        this.mProfilePhotoUrl = mProfilePhotoUrl;
    }

    public long getTimeStamp() {
        return mTimeStamp;
    }

    public void setTimeStamp(long mTimeStamp) {
        this.mTimeStamp = mTimeStamp;
    }

    public float getRating() {
        return mRating;
    }

    public void setRating(float mRating) {
        this.mRating = mRating;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public String getRelativeTimeDesc() {
        return mRelativeTimeDesc;
    }

    public void setRelativeTimeDesc(String mRelativeTimeDesc) {
        this.mRelativeTimeDesc = mRelativeTimeDesc;
    }
}
