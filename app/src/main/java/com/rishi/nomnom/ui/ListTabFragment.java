package com.rishi.nomnom.ui;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.model.LatLng;
import com.rishi.nomnom.MainApp;
import com.rishi.nomnom.R;
import com.rishi.nomnom.model.Restaurant;
import com.rishi.nomnom.viewmodel.RestaurantViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by rishi on 10/6/17.
 * Two separate tabs are created here and relevant layout is inflated
 */

public class ListTabFragment extends Fragment {
    private static final String TAG = ListTabFragment.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private RestaurantViewModel mRestaurantViewModel;
    private RestaurantListAdapter mRestaurantListAdapter;

    // Co-ordinates for SF for the task
    private final String location = "37.7749, -122.4194";
    private final LatLng sfLatLng = new LatLng(37.7749, -122.4194);

    @Inject
    ViewModelProvider.Factory mViewModelFactory;

    public static ListTabFragment newInstance() {
        ListTabFragment fragment = new ListTabFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ((MainApp) getActivity().getApplication()).getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: for tab ");

        mRestaurantViewModel = ViewModelProviders.of(this, mViewModelFactory).get(RestaurantViewModel.class);
        mRestaurantViewModel.fetchRestaurants(location);

        return inflateListTab(inflater, container);
    }

    /**
     * Inflates list view layout
     */
    private View inflateListTab(LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list_items);
        mRestaurantListAdapter = new RestaurantListAdapter(getContext(), new ArrayList<>());
        mRecyclerView.setAdapter(mRestaurantListAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRestaurantViewModel.getRestaurants(location).observe(this, this::addAdapterToRecyclerView);

        // Add scroll listener
        mRecyclerView.addOnScrollListener(new EndlessScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                mRestaurantViewModel.getNextPageRestaurants().observe(ListTabFragment.this, restaurants -> {
                    mRestaurantListAdapter.updateItems(restaurants);
                });
            }
        });
        return view;
    }

    /**
     * Attaches the list of restaurants ot the adapter for list view
     */
    private void addAdapterToRecyclerView(List<Restaurant> restaurants) {
        mRestaurantListAdapter.addItems(restaurants);
    }
}
