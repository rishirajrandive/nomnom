package com.rishi.nomnom.ui;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rishi.nomnom.R;
import com.rishi.nomnom.RestaurantDetailActivity;
import com.rishi.nomnom.databinding.RecyclerRestaurantTileBinding;
import com.rishi.nomnom.model.Restaurant;
import com.rishi.nomnom.util.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 10/6/17.
 */

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListHolder> {
    private static final String TAG = RestaurantListAdapter.class.getSimpleName();
    private List<Restaurant> mRestaurantList;
    private Context mContext;

    public RestaurantListAdapter(Context context, List<Restaurant> restaurantList){
        mContext = context;
        mRestaurantList = restaurantList;
    }

    @Override
    public RestaurantListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        RecyclerRestaurantTileBinding viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.recycler_restaurant_tile, parent, false);
        RestaurantListHolder viewHolder = new RestaurantListHolder(mContext, viewDataBinding.getRoot());

        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Log.d(TAG, "On item click in adapter");
                Context context = view.getContext();
                Intent intent = new Intent(context, RestaurantDetailActivity.class);
                intent.putExtra(RestaurantDetailActivity.ARG_PLACE_ID, mRestaurantList.get(position).getPlaceId());
                context.startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RestaurantListHolder holder, int position) {
        Restaurant data = mRestaurantList.get(position);
        holder.bindItem(data);
    }

    @Override
    public int getItemCount() {
        return mRestaurantList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItems(List<Restaurant> restaurants){
        mRestaurantList = new ArrayList<>();
        mRestaurantList = restaurants;
        notifyDataSetChanged();
    }
}
