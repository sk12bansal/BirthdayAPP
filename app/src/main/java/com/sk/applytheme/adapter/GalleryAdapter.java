package com.sk.applytheme.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.applytheme.R;
import com.sk.applytheme.model.Gallery;
import com.sk.applytheme.model.Landscape;

import java.util.List;

import static android.content.ContentValues.TAG;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.MyViewHolder> {

    private List<Gallery> mData;
    private LayoutInflater mInflater;

    public  GalleryAdapter(Context context, List<Gallery> data){
        this.mData=data;
        this.mInflater= LayoutInflater.from(context);
    }

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=mInflater.inflate(R.layout.gallery_list_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Log.d(TAG,"onBindViewHolder"+position);
        Gallery currentObj=mData.get(position);
        holder.setData(currentObj,position);
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imgThumb;
        int position;
        Gallery current;


        public MyViewHolder(View itemView) {
            super(itemView);
            imgThumb = itemView.findViewById(R.id.gallery_img);
        }

        public void setData(Gallery current, int position) {
            this.imgThumb.setImageResource(current.getImageID());
            this.position = position;
            this.current = current;

        }

        @Override
        public void onClick(View view) {

        }
    }
}
