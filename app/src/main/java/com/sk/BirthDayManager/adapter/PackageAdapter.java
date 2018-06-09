package com.sk.BirthDayManager.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.BirthDayManager.R;
import com.sk.BirthDayManager.model.Cake;
import com.sk.BirthDayManager.model.Packages;

import java.util.List;

public class PackageAdapter extends RecyclerView.Adapter<PackageAdapter.MyViewHolder> {
    private List<Packages> mdataList;
    private LayoutInflater mInflater;

    public PackageAdapter(Context context, List<Packages> data){
        this.mdataList=data;
        this.mInflater= LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.cart_list_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Packages currentobj=mdataList.get(position);
        holder.setData(currentobj,position);

    }

    @Override
    public int getItemCount() {
        return mdataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView itemName,price;
        ImageView cardimg;
        int position;
        Packages current;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemName=itemView.findViewById(R.id.cart_item);
            cardimg=itemView.findViewById(R.id.cart_img);
            price=itemView.findViewById(R.id.cart_price);
        }

        public void setData(Packages current, int position) {
            this.cardimg.setImageResource(current.getImage());
            this.itemName.setText(current.getItemName());
            this.price.setText(current.getPrice());
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
