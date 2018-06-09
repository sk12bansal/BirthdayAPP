package com.sk.BirthDayManager.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.sk.BirthDayManager.R;
import com.sk.BirthDayManager.app.CartActivity;
import com.sk.BirthDayManager.app.MainActivity;
import com.sk.BirthDayManager.model.ShopData;

import java.util.List;

import static android.content.ContentValues.TAG;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.MyViewHolder>{

    private List<ShopData> mData;
    private LayoutInflater mInflater;
    private  Context context;

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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder"+position);
        ShopData currentObj=mData.get(position);
        holder.setData(currentObj,position);
        handleOnCLick(holder,position);
//        holder.setListener();
    }


    public  void handleOnCLick(final MyViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                int id;
                switch (position) {
                    case 0:
                        System.out.println("suraj0  handleOnCLick  "+position);
                        System.out.println("suraj0  loop  " + position);
                        intent = new Intent(context, CartActivity.class);
                        intent.putExtra("pos", position);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 1:
                        System.out.println("suraj0  handleOnCLick  "+position);
                        System.out.println("suraj0  loop  " + position);
                        intent = new Intent(context, CartActivity.class);
                        intent.putExtra("pos", position);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 2:
                        System.out.println("suraj0  handleOnCLick  "+position);
                        System.out.println("suraj0  loop  " + position);
                        intent = new Intent(context, CartActivity.class);
                        intent.putExtra("pos", position);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 3:
                        System.out.println("suraj0  handleOnCLick  "+position);
                        System.out.println("suraj0  loop  " + position);
                        intent = new Intent(context, CartActivity.class);
                        intent.putExtra("pos", position);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    /*public void removeItem(int position){
        mData.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,mData.size());

    }

    private void addItem(int position, ShopData current) {
        mData.add(position,current);
        notifyItemInserted(position);
        notifyItemRangeChanged(position,mData.size());
    }*/
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,item;
        ImageView cardimg;
        int position;
        ShopData current;




        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
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


    }

}
