package com.sk.BirthDayManager.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sk.BirthDayManager.R;
import com.sk.BirthDayManager.adapter.ServiceAdapter;
import com.sk.BirthDayManager.model.Service;

public class ServiceScreen extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.service_fragment,container,false);
        setRecylerView(view);
        return view;
    }
    private void setRecylerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.Servicerecyclerview);
        ServiceAdapter adapter = new ServiceAdapter(getContext(), Service.getData());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(getContext());
        linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
