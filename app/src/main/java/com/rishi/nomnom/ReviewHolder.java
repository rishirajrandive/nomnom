package com.rishi.nomnom;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.rishi.nomnom.databinding.RecyclerReviewsBinding;
import com.rishi.nomnom.model.Review;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by rishi on 10/7/17.
 */

public class ReviewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = PhotoHolder.class.getSimpleName();
    private Context mContext;
    private RecyclerReviewsBinding mDataBinding;

    public ReviewHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
        mDataBinding = DataBindingUtil.bind(itemView);
    }

    public void bindItem(Review review){
        Log.d(TAG, "bindItem: Binding item "+ review.getAuthorName());
        mDataBinding.setReview(review);
    }

    @BindingAdapter({"profile"})
    public static void loadProfileImage(CircleImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .placeholder(R.drawable.ic_placeholder)
                .into(view);
    }
}

