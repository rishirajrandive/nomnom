package com.rishi.nomnom;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by rishi on 10/6/17.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private static final String TAG = FragmentStatePagerAdapter.class.getSimpleName();
    private int mTotalTabs = 2;
    private Context mContext;
    private String[] mTabTitles = {"Map", "List"};

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mTotalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "Get item called for position "+ position);
        return TabFragment.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        Log.d(TAG, "Page title "+ mTabTitles[position]);
        return mTabTitles[position];
    }
}
