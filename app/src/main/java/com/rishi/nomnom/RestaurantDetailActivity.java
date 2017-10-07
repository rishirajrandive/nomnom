package com.rishi.nomnom;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.rishi.nomnom.databinding.ActivityRestaurantDetailBinding;
import com.rishi.nomnom.model.OpenHours;
import com.rishi.nomnom.model.Photo;
import com.rishi.nomnom.viewmodel.RestaurantViewModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantDetailActivity extends AppCompatActivity {
    private static final String TAG = RestaurantDetailActivity.class.getSimpleName();
    public static final String ARG_PLACE_ID = "ARG_PLACE_ID";
    private RestaurantViewModel mRestaurantViewModel;
    private ActivityRestaurantDetailBinding mDataBinding;

    @Inject
    ViewModelProvider.Factory mViewModelFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ((MainApp) getApplication()).getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String placeId = null;
        if (extras != null) {
            placeId = extras.getString(ARG_PLACE_ID);
        }
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_restaurant_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_restaurant_detail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        RecyclerView rvPhotos = (RecyclerView) findViewById(R.id.rv_photos);
        PhotoAdapter photoAdapter = new PhotoAdapter(this, new ArrayList<>(0));
        rvPhotos.setAdapter(photoAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManager.scrollToPosition(0);
        rvPhotos.setLayoutManager(layoutManager);

        RecyclerView rvReview = (RecyclerView) findViewById(R.id.rv_reviews);
        ReviewAdapter reviewAdapter = new ReviewAdapter(this, new ArrayList<>(0));
        rvReview.setAdapter(reviewAdapter);
        rvReview.setLayoutManager(new LinearLayoutManager(this));

        mRestaurantViewModel = ViewModelProviders.of(this, mViewModelFactory).get(RestaurantViewModel.class);
        if(placeId == null) {
            Log.d(TAG, "onCreate: Something is not right here place Id can't be null ");
            return;
        }
        mRestaurantViewModel.getRestaurantDetail(placeId).observe(this, restaurantDetail -> {
            Log.d(TAG, "onCreate: Binding the details");
            mDataBinding.setRestaurant(restaurantDetail);
            reviewAdapter.addItems(restaurantDetail.getReviews());
            photoAdapter.addItems(restaurantDetail.getPhotoList());
        });
    }

    @BindingAdapter({"detail_price_level"})
    public static void showPriceLevel(TextView view, int priceLevel) {
        Log.d(TAG, "Binding price level");
        String price = "$";
        if(priceLevel == 2) {
            price += "$";
        }else if(priceLevel == 3 || priceLevel == 4) {
            price += "$$";
        }
        view.setText(price);
    }

    @BindingAdapter({"detail_open_now"})
    public static void showOpenClosed(TextView view, OpenHours openHours) {
        if(openHours == null) {
            return;
        }
        Log.d(TAG, "showOpenClosed: ");
        if(openHours.isOpenNow()) {
            view.setText("Open");
            view.setTextColor(Color.parseColor("#4CAF50"));
        }else {
            view.setText("Closed");
            view.setTextColor(Color.parseColor("#FF5722"));
        }
    }

    @BindingAdapter({"detail_photo"})
    public static void showRestaurantPhoto(ImageView view, List<Photo> photos) {
        if(photos == null) {
            return;
        }
        Log.d(TAG, "showRestaurantPhoto: " + photos.get(0).getPhotoUrl());

        Picasso.with(view.getContext())
                .load(photos.get(0).getPhotoUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(view);
    }
}
