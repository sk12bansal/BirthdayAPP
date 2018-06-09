package com.sk.BirthDayManager.app;

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

import com.sk.BirthDayManager.R;
import com.sk.BirthDayManager.adapter.BouquetAdapter;
import com.sk.BirthDayManager.adapter.CakeAdapter;
import com.sk.BirthDayManager.adapter.ShopAdapter;
import com.sk.BirthDayManager.model.Bouquet;
import com.sk.BirthDayManager.model.Cake;
import com.sk.BirthDayManager.model.ShopData;

public class CartActivity extends AppCompatActivity {
    RecyclerView mRecyclerView1,mRecyclerView2;
    TextView cartTitle;
    String[] shoptitles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_main);
        cartTitle = findViewById(R.id.cart_title);
        shoptitles = ShopData.getTitles();
        int id = getIntent().getExtras().getInt("pos");
        System.out.println("suraj1  id  " + id);
        switch (id){
            case 0:
                mRecyclerView1 = findViewById(R.id.Bouquetrecyclerview);
                cartTitle.setText(shoptitles[id]);
                setRecylerView(this, mRecyclerView1, id);
                break;
            case 1:
                mRecyclerView2 = findViewById(R.id.Cakerecyclerview);
                cartTitle.setText(shoptitles[id]);
                System.out.println("suraj1  cakeadpter  " + id);
                setRecylerView(this, mRecyclerView2, id);
                break;
        }

    }

    public static void setRecylerView(final Context context, RecyclerView mRecyclerView, int position) {

        GridLayoutManager mGridLayoutManager;
        switch (position) {
            case 0:
                //System.out.println("suraj0  setRecylerView  " + position);
                BouquetAdapter bouquetAdapter = new BouquetAdapter(context, Bouquet.getData());
                mRecyclerView.setAdapter(bouquetAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                //linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
            case 1:
                System.out.println("suraj1  cakeRecylerView  " + position);
                CakeAdapter cakeAdapter = new CakeAdapter(context, Cake.getData());
                mRecyclerView.setAdapter(cakeAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                //linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
        }

    }
    //APP ID: 1029175183900177
}
