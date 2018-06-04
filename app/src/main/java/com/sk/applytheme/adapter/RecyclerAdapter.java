package com.sk.applytheme.adapter;

import android.content.Context;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.applytheme.R;
import com.sk.applytheme.model.Landscape;

import java.util.List;

import static android.content.ContentValues.TAG;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private List<Landscape> mData;
    private LayoutInflater mInflater;
    public  RecyclerAdapter(Context context, List<Landscape> data){
        this.mData=data;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");
        View view=mInflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder"+position);
        Landscape currentObj=mData.get(position);
        holder.setData(currentObj,position);
        holder.setListener();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void removeItem(int position){
        mData.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,mData.size());

    }

    private void addItem(int position, Landscape current) {
        mData.add(position,current);
        notifyItemInserted(position);
        notifyItemRangeChanged(position,mData.size());
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView imgThumb,imgDelete,imgAdd;
        int position;
        Landscape current;


        public MyViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.tvTitle);
            imgThumb=itemView.findViewById(R.id.img_row);
            imgDelete=itemView.findViewById(R.id.img_row_delete);
            imgAdd=itemView.findViewById(R.id.img_row_add);
        }

        public void setData(Landscape current, int position) {
            this.title.setText(current.getTitle());
            this.imgThumb.setImageResource(current.getImageID());
            this.position=position;
            this.current=current;

        }


        public void setListener() {
            imgDelete.setOnClickListener(MyViewHolder.this);
            imgAdd.setOnClickListener(MyViewHolder.this);
        }

        @Override
        public void onClick(View view) {
            int id=view.getId();
            switch (id){
                case R.id.img_row_add:
                    addItem(position,current);
                    break;
                case R.id.img_row_delete:
                    removeItem(position);
                    break;

            }
        }
    }

}
