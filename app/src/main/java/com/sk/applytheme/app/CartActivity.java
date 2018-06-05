package com.sk.applytheme.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sk.applytheme.R;
import com.sk.applytheme.adapter.BouquetAdapter;
import com.sk.applytheme.model.Bouquet;
import com.sk.applytheme.model.ShopData;

public class CartActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    TextView cartTitle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_main);
        String[] shoptitles=ShopData.getTitles();
        mRecyclerView = findViewById(R.id.Cartrecyclerview);
        cartTitle=findViewById(R.id.cart_title);
        cartTitle.setText(shoptitles[0]);
        setRecylerView(mRecyclerView);
       /* mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }
    private void setRecylerView(RecyclerView mRecyclerView) {
        BouquetAdapter adapter = new BouquetAdapter(this, Bouquet.getData());
        mRecyclerView.setAdapter(adapter);

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(this,2);
        //linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
