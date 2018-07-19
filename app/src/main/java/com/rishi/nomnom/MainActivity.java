package com.rishi.nomnom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.rishi.nomnom.ui.FragmentPagerAdapter;

/**
 * Created by rishi on 10/6/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String[] tabs = {"Tasks", "Groups"};
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), this));

        TabLayout tablayout = findViewById(R.id.sliding_tabs);
        tablayout.setupWithViewPager(viewPager);
    }
}
