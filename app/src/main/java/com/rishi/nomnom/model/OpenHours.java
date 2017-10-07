package com.rishi.nomnom.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class OpenHours {
    @SerializedName("open_now")
    @Expose
    private boolean mOpenNow;
    @SerializedName("weekday_text")
    @Expose
    private List<String> mWeekdayText;

    public boolean isOpenNow() {
        return mOpenNow;
    }

    public void setOpenNow(boolean mOpenNow) {
        this.mOpenNow = mOpenNow;
    }

    public List<String> getWeekdayText() {
        return mWeekdayText;
    }

    public void setWeekdayText(List<String> mWeekdayText) {
        this.mWeekdayText = mWeekdayText;
    }
}
