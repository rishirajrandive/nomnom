package com.rishi.nomnom.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.rishi.nomnom.R;
import com.rishi.nomnom.databinding.RecyclerReviewsBinding;
import com.rishi.nomnom.model.Review;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 10/7/17.
 */

public class ReviewAdapter extends RecyclerView.Adapter<ReviewHolder> {
    private Context mContext;
    private List<Review> mReviews;

    public ReviewAdapter(Context context, List<Review> reviews){
        mReviews = reviews;
        mContext = context;
    }

    @Override
    public ReviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerReviewsBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.recycler_reviews, parent, false);

        return new ReviewHolder(mContext, dataBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ReviewHolder holder, int position) {
        holder.bindItem(mReviews.get(position));
    }

    @Override
    public int getItemCount() {
        return mReviews.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItems(List<Review> reviews) {
        mReviews = new ArrayList<>();
        mReviews = reviews;
        notifyDataSetChanged();
    }
}
