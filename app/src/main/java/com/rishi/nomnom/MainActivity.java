package com.rishi.nomnom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by rishi on 10/6/17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String[] tabs = {"Tasks", "Groups"};
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), this));

        TabLayout tablayout = (TabLayout)findViewById(R.id.sliding_tabs);
        tablayout.setupWithViewPager(viewPager);

//        FloatingActionButton search = (FloatingActionButton) findViewById(R.id.search);
//        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        String location = "37.7749,-122.4194";
//        mRestaurantViewModel = ViewModelProviders.of(this, mViewModelFactory).get(RestaurantViewModel.class);
//        mRestaurantViewModel.getRestaurants(location).observe(this, restaurantTiles -> {
//            Log.d(TAG, "In main activity with rest "+ restaurantTiles.size());
//        });
    }

}
