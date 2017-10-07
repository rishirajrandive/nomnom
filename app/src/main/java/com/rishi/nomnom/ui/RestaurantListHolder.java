package com.rishi.nomnom.ui;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rishi.nomnom.R;
import com.rishi.nomnom.databinding.RecyclerRestaurantTileBinding;
import com.rishi.nomnom.model.OpenHours;
import com.rishi.nomnom.model.Photo;
import com.rishi.nomnom.model.Restaurant;
import com.rishi.nomnom.util.ItemClickListener;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by rishi on 10/6/17.
 * Binds the list view items to the data
 */

public class RestaurantListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private static final String TAG = RestaurantListHolder.class.getSimpleName();
    private ItemClickListener mItemClickListener;
    private RecyclerRestaurantTileBinding mDataBinding;
    private Context mContext;

    public RestaurantListHolder(Context context, View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        mContext = context;
        mDataBinding = DataBindingUtil.bind(itemView);
    }

    public void bindItem(Restaurant restaurant){
        Log.d(TAG, "bindItem: restaurant "+ restaurant.getName());
        mDataBinding.setRestaurant(restaurant);
    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition(); // gets item position
        if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
            mItemClickListener.onItemClick(view, position);
        }
    }

    public void setItemClickListener(ItemClickListener listener){
        mItemClickListener = listener;
    }

    @BindingAdapter({"price_level"})
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

    @BindingAdapter({"open_now"})
    public static void showOpenClosed(TextView view, OpenHours openHours) {
        if(openHours == null) {
            return;
        }
        if(openHours.isOpenNow()) {
            view.setText(R.string.text_open);
            view.setTextColor(Color.parseColor("#4CAF50"));
        }else {
            view.setText(R.string.text_close);
            view.setTextColor(Color.parseColor("#FF5722"));
        }
    }

    @BindingAdapter({"photo"})
    public static void showRestaurantPhoto(ImageView view, List<Photo> photos) {
        if(photos == null || photos.size() == 0) {
            return;
        }
        Picasso.with(view.getContext())
                .load(photos.get(0).getPhotoUrl())
                .fit()
                .centerCrop()
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(view);
    }
}
