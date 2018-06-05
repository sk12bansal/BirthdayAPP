package com.sk.applytheme.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sk.applytheme.R;
import com.sk.applytheme.adapter.ShopAdapter;
import com.sk.applytheme.model.ShopData;

public class ShopScreen extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shop_fragment,container,false);
        setRecylerView(view);
        return view;
    }

    private void setRecylerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        ShopAdapter adapter = new ShopAdapter(getContext(), ShopData.getData());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(getContext());
        linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
