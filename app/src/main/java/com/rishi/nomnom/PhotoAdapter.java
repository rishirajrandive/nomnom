package com.rishi.nomnom;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rishi.nomnom.model.Photo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 10/7/17.
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoHolder> {
    private Context mContext;
    private List<Photo> mPhotos;

    public PhotoAdapter(Context context, List<Photo> photos){
        mPhotos = photos;
        mContext = context;
    }

    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View tabContentView = inflater.inflate(R.layout.recycler_photo, parent, false);

        PhotoHolder viewHolder = new PhotoHolder(mContext, tabContentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {
        holder.bindItem(mPhotos.get(position));
    }

    @Override
    public int getItemCount() {
        return mPhotos.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItems(List<Photo> photos) {
        mPhotos = new ArrayList<>();
        mPhotos = photos;
        notifyDataSetChanged();
    }
}
