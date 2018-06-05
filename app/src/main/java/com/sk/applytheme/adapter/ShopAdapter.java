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
import com.sk.applytheme.model.ShopData;

import java.util.List;

import static android.content.ContentValues.TAG;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.MyViewHolder>{

    private List<ShopData> mData;
    private LayoutInflater mInflater;
    public ShopAdapter(Context context, List<ShopData> data){
        this.mData=data;
        this.mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");
        View view=mInflater.inflate(R.layout.shop_list_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder"+position);
        ShopData currentObj=mData.get(position);
        holder.setData(currentObj,position);
//        holder.setListener();
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

    private void addItem(int position, ShopData current) {
        mData.add(position,current);
        notifyItemInserted(position);
        notifyItemRangeChanged(position,mData.size());
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title,item;
        ImageView cardimg;
        int position;
        ShopData current;


        public MyViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.shopTitle);
            cardimg=itemView.findViewById(R.id.cardimg);
            item=itemView.findViewById(R.id.shopitems);
        }

        public void setData(ShopData current, int position) {
            this.title.setText(current.getTitle());
            this.cardimg.setImageResource(current.getImageID());
            this.item.setText(current.getItem());
            this.position=position;
            this.current=current;

        }


      /*  public void setListener() {
            imgDelete.setOnClickListener(MyViewHolder.this);
            imgAdd.setOnClickListener(MyViewHolder.this);
        }*/

        @Override
        public void onClick(View view) {
           /* int id=view.getId();
            switch (id){
                case R.id.img_row_add:
                    addItem(position,current);
                    break;
                case R.id.img_row_delete:
                    removeItem(position);
                    break;

            }*/
        }
    }

}
