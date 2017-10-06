package com.rishi.nomnom;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rishi.nomnom.util.TabType;

/**
 * Created by rishi on 10/6/17.
 */

public class TabFragment extends Fragment implements OnMapReadyCallback {
    private static final String TAG = TabFragment.class.getSimpleName();
    public static final String ARG_TAB_POSITION = "ARG_TAB_POSITION";
    private int mTabPosition;
    private GoogleMap mMap;

    public static TabFragment newInstance(int tabPostion) {
        Bundle args = new Bundle();
        args.putInt(ARG_TAB_POSITION, tabPostion);
        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTabPosition = getArguments().getInt(ARG_TAB_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: for tab position " + mTabPosition);
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
        // TODO Add list adapter
        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
