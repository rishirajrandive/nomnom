package com.rishi.nomnom.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
import com.rishi.nomnom.viewmodel.RestaurantViewModel;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by rishi on 10/18/17.
 */

public class MapTabFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private static final String TAG = MapTabFragment.class.getSimpleName();
    private GoogleMap mMap;
    private RestaurantViewModel mRestaurantViewModel;
    private RestaurantListAdapter mRestaurantListAdapter;

    // Co-ordinates for SF for the task
    private final String location = "37.7749, -122.4194";
    private final LatLng sfLatLng = new LatLng(37.7749, -122.4194);

    @Inject
    ViewModelProvider.Factory mViewModelFactory;

    public static MapTabFragment newInstance() {
        MapTabFragment fragment = new MapTabFragment();
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
        Log.d(TAG, "onCreateView: for map ");

        mRestaurantViewModel = ViewModelProviders.of(this, mViewModelFactory).get(RestaurantViewModel.class);
        mRestaurantViewModel.fetchRestaurants(location);

        return inflateMapTab(inflater, container);
    }

    /**
     * Inflates the map layout
     */
    private View inflateMapTab(LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

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

    /**
     * Adds markers for all the restaurants found
     */
    private void addMarkersOnMap(List<Restaurant> restaurants) {
        if (mMap == null || restaurants == null || restaurants.size() == 0) {
            return;
        }
        for (Restaurant restaurant : restaurants) {
            Location location = restaurant.getGeometry().getLocation();
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            Marker marker = mMap.addMarker(new MarkerOptions()
                    .position(latLng)
                    .title(restaurant.getName()));
            marker.setTag(restaurant);
        }

        mMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Restaurant restaurant = (Restaurant) marker.getTag();
        if (restaurant == null) {
            Log.e(TAG, "onMarkerClick: Restaurant object null");
            return false;
        }
        Toast.makeText(getContext(), restaurant.getName(), Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onMarkerClick: Opening detail view for " + restaurant.getName());
        Intent intent = new Intent(getContext(), RestaurantDetailActivity.class);
        intent.putExtra(RestaurantDetailActivity.ARG_PLACE_ID, restaurant.getPlaceId());
        getActivity().startActivity(intent);
        return false;
    }
}
