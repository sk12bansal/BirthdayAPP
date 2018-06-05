package com.sk.applytheme.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sk.applytheme.R;
import com.sk.applytheme.adapter.GalleryAdapter;
import com.sk.applytheme.model.Gallery;

public class GalleryScreen extends Fragment{

    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gallery_fragment,container,false);
        recyclerView = view.findViewById(R.id.recyclerview);
        setRecylerView();
        return view;
    }
     private void setRecylerView() {
        GalleryAdapter adapter = new GalleryAdapter(getContext(), Gallery.getData());
        recyclerView.setAdapter(adapter);

        /*LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(getContext());
        linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManagerVertical);*/
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getContext(), 4); // (Context context, int spanCount)
         recyclerView.setLayoutManager(mGridLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
