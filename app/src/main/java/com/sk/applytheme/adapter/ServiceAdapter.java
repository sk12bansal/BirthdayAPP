package com.sk.applytheme.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.applytheme.R;
import com.sk.applytheme.model.Service;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    private List<Service> mdataList;
    private LayoutInflater mInflater;

    public ServiceAdapter(Context context,List<Service> mdata){
        this.mdataList=mdata;
        this.mInflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.service_lsit_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Service currentobj=mdataList.get(position);
        holder.setData(currentobj,position);

    }

    @Override
    public int getItemCount() {
        return mdataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title,desc;
        ImageView cardimg;
        int position;
        Service current;


        public MyViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.servicetitle);
            desc=itemView.findViewById(R.id.servicedesc);
            cardimg=itemView.findViewById(R.id.serviceimage);
        }
        public void setData(Service current, int position) {
            this.title.setText(current.getTitle());
            System.out.println("suraj title "+current.getTitle());
            this.cardimg.setImageResource(current.getImages());
            this.desc.setText(current.getDescription());
            System.out.println("suraj desc "+current.getDescription());
            this.position=position;
            this.current=current;
        }
    }
}
