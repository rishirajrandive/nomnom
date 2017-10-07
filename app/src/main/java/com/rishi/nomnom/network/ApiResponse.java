package com.rishi.nomnom.network;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rishi on 10/6/17.
 */

public class ApiResponse {
    @SerializedName("results")
    @Expose
    private JsonElement mResults;
    @SerializedName("result")
    @Expose
    private JsonElement mResult;
    @SerializedName("status")
    @Expose
    private String mStatus;
    @SerializedName("next_page_token")
    @Expose
    private String mNextPageToken;

    public JsonElement getResults() {
        return mResults;
    }

    public void setResults(JsonElement mResults) {
        this.mResults = mResults;
    }

    public JsonElement getResult() {
        return mResult;
    }

    public void setResult(JsonElement mResult) {
        this.mResult = mResult;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getNextPageToken() {
        return mNextPageToken;
    }

    public void setNextPageToken(String mNextPageToken) {
        this.mNextPageToken = mNextPageToken;
    }
}
