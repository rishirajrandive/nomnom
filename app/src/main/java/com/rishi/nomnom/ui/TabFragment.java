package com.rishi.nomnom.ui;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rishi.nomnom.MainApp;
import com.rishi.nomnom.R;
import com.rishi.nomnom.RestaurantDetailActivity;
import com.rishi.nomnom.model.Location;
import com.rishi.nomnom.model.Restaurant;
import com.rishi.nomnom.util.TabType;
import com.rishi.nomnom.viewmodel.RestaurantViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by rishi on 10/6/17.
 */

public class TabFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private static final String TAG = TabFragment.class.getSimpleName();
    public static final String ARG_TAB_POSITION = "ARG_TAB_POSITION";
    private int mTabPosition;
    private GoogleMap mMap;
    private RecyclerView mRecyclerView;
    private RestaurantViewModel mRestaurantViewModel;
    private RestaurantListAdapter mRestaurantListAdapter;

    // Co-ordinates for SF for the task
    private final String location = "37.7749, -122.4194";
    private final LatLng sfLatLng = new LatLng(37.7749, -122.4194);

    @Inject
    ViewModelProvider.Factory mViewModelFactory;

    public static TabFragment newInstance(int tabPostion) {
        Bundle args = new Bundle();
        args.putInt(ARG_TAB_POSITION, tabPostion);
        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ((MainApp) getActivity().getApplication()).getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        mTabPosition = getArguments().getInt(ARG_TAB_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: for tab position " + mTabPosition);

        mRestaurantViewModel = ViewModelProviders.of(this, mViewModelFactory).get(RestaurantViewModel.class);
        mRestaurantViewModel.fetchRestaurants(location);

        switch (TabType.valueOf(mTabPosition)) {
            case MAP_TAB:
                return inflateMapTab(inflater, container);
            case LIST_TAB:
                return inflateListTab(inflater, container);
            default:
                return inflateMapTab(inflater, container);
        }
    }

    private View inflateMapTab(LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return view;
    }

    private View inflateListTab(LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list_items);
        mRestaurantListAdapter = new RestaurantListAdapter(getContext(), new ArrayList<>());
        mRecyclerView.setAdapter(mRestaurantListAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mRestaurantViewModel.getRestaurants(location).observe(this, this::addAdapterToRecyclerView);
        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sfLatLng));
        mMap.animateCamera(CameraUpdateFactory
                .newLatLngZoom(sfLatLng, Math.max(16, mMap.getCameraPosition().zoom)));
        mRestaurantViewModel.getRestaurants(location).observe(this, this::addMarkersOnMap);

    }

    private void addMarkersOnMap(List<Restaurant> restaurants) {
        if(mMap == null || restaurants == null || restaurants.size() == 0) {
            return;
        }
        for(Restaurant restaurant : restaurants) {
            Location location = restaurant.getGeometry().getLocation();
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            Marker marker = mMap.addMarker(new MarkerOptions()
            .position(latLng)
            .title(restaurant.getName()));
            marker.setTag(restaurant);
        }

        mMap.setOnMarkerClickListener(this);
    }

    private void addAdapterToRecyclerView(List<Restaurant> restaurants) {
        mRestaurantListAdapter.addItems(restaurants);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Restaurant restaurant = (Restaurant) marker.getTag();
        if(restaurant == null) {
            Log.e(TAG, "onMarkerClick: Restaurant object null");
            return false;
        }
        Toast.makeText(getContext(), restaurant.getName(), Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onMarkerClick: Opening detail view for "+ restaurant.getName());
        Intent intent = new Intent(getContext(), RestaurantDetailActivity.class);
        intent.putExtra(RestaurantDetailActivity.ARG_PLACE_ID, restaurant.getPlaceId());
        getActivity().startActivity(intent);
        return false;
    }
}
