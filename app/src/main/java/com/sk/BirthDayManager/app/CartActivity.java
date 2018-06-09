package com.sk.BirthDayManager.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import com.sk.BirthDayManager.adapter.ChocolateAdapter;
import com.sk.BirthDayManager.adapter.PackageAdapter;
import com.sk.BirthDayManager.adapter.ShopAdapter;
import com.sk.BirthDayManager.model.Bouquet;
import com.sk.BirthDayManager.model.Cake;
import com.sk.BirthDayManager.model.Chocolate;
import com.sk.BirthDayManager.model.Packages;
import com.sk.BirthDayManager.model.ShopData;

public class CartActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    TextView cartTitle;
    String[] shoptitles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_main);
        cartTitle = findViewById(R.id.cart_title);
        shoptitles = ShopData.getTitles();
        int id = getIntent().getExtras().getInt("pos");
        switch (id) {
            case 0:
                mRecyclerView = findViewById(R.id.Bouquetrecyclerview);
                cartTitle.setText(shoptitles[id]);
                setRecylerView(this, mRecyclerView, id);
                break;
            case 1:
                mRecyclerView = findViewById(R.id.Cakerecyclerview);
                cartTitle.setText(shoptitles[id]);
                setRecylerView(this, mRecyclerView, id);
                break;
            case 2:
                mRecyclerView = findViewById(R.id.Chocolaterecyclerview);
                cartTitle.setText(shoptitles[id]);
                setRecylerView(this, mRecyclerView, id);
                break;
            case 3:
                mRecyclerView = findViewById(R.id.Packagesrecyclerview);
                cartTitle.setText(shoptitles[id]);
                setRecylerView(this, mRecyclerView, id);
                break;
        }

    }

    public static void setRecylerView(final Context context, RecyclerView mRecyclerView, int position) {

        GridLayoutManager mGridLayoutManager;
        switch (position) {
            case 0:
                BouquetAdapter bouquetAdapter = new BouquetAdapter(context, Bouquet.getData());
                mRecyclerView.setAdapter(bouquetAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
            case 1:
                CakeAdapter cakeAdapter = new CakeAdapter(context, Cake.getData());
                mRecyclerView.setAdapter(cakeAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
            case 2:

                ChocolateAdapter chocolateAdapter = new ChocolateAdapter(context, Chocolate.getData());
                mRecyclerView.setAdapter(chocolateAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
            case 3:
                PackageAdapter packageAdapter = new PackageAdapter(context, Packages.getData());
                mRecyclerView.setAdapter(packageAdapter);

                mGridLayoutManager = new GridLayoutManager(context, 2);
                //linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
                mRecyclerView.setLayoutManager(mGridLayoutManager);

                mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                break;
        }

    }
    //APP ID: 1029175183900177
}
